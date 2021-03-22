package byx.web.bookstore.controller;

import byx.web.bookstore.common.Result;
import byx.web.bookstore.common.UserManager;
import byx.web.bookstore.pojo.dto.FavoriteBookDTO;
import byx.web.bookstore.pojo.dto.UserFavoriteQueryDTO;
import byx.web.bookstore.service.FavoriteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
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

    @RequestMapping("/query")
    public Result<?> query(@RequestBody @Validated UserFavoriteQueryDTO dto) {
        dto.setUserId(userManager.getCurrentUser().getId());
        return Result.success(favoriteService.getUserFavorites(dto));
    }

    @RequestMapping("is-favorite")
    public Result<?> isFavorite(@RequestBody @NotNull(message = "bookId不能为空") Integer bookId) {
        FavoriteBookDTO dto = new FavoriteBookDTO();
        dto.setUserId(userManager.getCurrentUser().getId());
        dto.setBookId(bookId);
        return Result.success(favoriteService.isFavorite(dto));
    }
}
