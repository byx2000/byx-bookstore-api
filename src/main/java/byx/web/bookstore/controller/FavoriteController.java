package byx.web.bookstore.controller;

import byx.web.bookstore.common.PageInfo;
import byx.web.bookstore.common.Result;
import byx.web.bookstore.common.UserManager;
import byx.web.bookstore.pojo.dto.FavoriteBookDTO;
import byx.web.bookstore.pojo.dto.UserFavoriteQueryDTO;
import byx.web.bookstore.pojo.vo.FavoriteVO;
import byx.web.bookstore.service.FavoriteService;
import byx.web.bookstore.util.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.constraints.NotNull;

@RestController
@RequestMapping("/favorite")
public class FavoriteController {
    @Autowired
    private FavoriteService favoriteService;

    @Autowired
    private UserManager userManager;

    @PostMapping("/query")
    public Result<PageInfo<FavoriteVO>> query(@RequestBody @Validated UserFavoriteQueryDTO dto) {
        dto.setUserId(userManager.getCurrentUser().getId());
        return Result.success(favoriteService.getUserFavorites(dto));
    }

    @PostMapping("/is-favorite")
    public Result<Boolean> isFavorite(@RequestBody @NotNull(message = "bookId不能为空") Integer bookId) {
        FavoriteBookDTO dto = new FavoriteBookDTO();
        dto.setUserId(userManager.getCurrentUser().getId());
        dto.setBookId(bookId);
        return Result.success(favoriteService.isFavorite(dto));
    }

    @PostMapping("/add")
    public Result<?> addFavorite(@RequestBody @NotNull(message = "bookId不能为空") Integer bookId) {
        FavoriteBookDTO dto = new FavoriteBookDTO();
        dto.setUserId(userManager.getCurrentUser().getId());
        dto.setBookId(bookId);
        dto.setTime(DateUtils.now());
        favoriteService.addFavorite(dto);
        return Result.success();
    }

    @PostMapping("/cancel")
    public Result<?> cancelFavorite(@RequestBody @NotNull(message = "bookId不能为空") Integer bookId) {
        FavoriteBookDTO dto = new FavoriteBookDTO();
        dto.setUserId(userManager.getCurrentUser().getId());
        dto.setBookId(bookId);
        favoriteService.cancelFavorite(dto);
        return Result.success();
    }
}
