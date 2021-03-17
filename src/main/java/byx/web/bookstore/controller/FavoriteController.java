package byx.web.bookstore.controller;

import byx.web.bookstore.common.Result;
import byx.web.bookstore.common.Status;
import byx.web.bookstore.common.UserManager;
import byx.web.bookstore.pojo.dto.UserFavoriteQueryDTO;
import byx.web.bookstore.pojo.vo.UserVO;
import byx.web.bookstore.service.FavoriteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/favorite")
public class FavoriteController {
    @Autowired
    private FavoriteService favoriteService;

    @Autowired
    private UserManager userManager;

    @RequestMapping("/query")
    public Result<?> query(@RequestBody @Validated UserFavoriteQueryDTO dto) {
        UserVO user = userManager.getCurrentUser();
        if (user == null) {
            return Result.fail(Status.NOT_LOGGED_IN);
        }
        dto.setUserId(user.getId());
        return Result.success(favoriteService.getUserFavorites(dto));
    }
}
