package byx.web.bookstore.service;

import byx.web.bookstore.common.PageInfo;
import byx.web.bookstore.pojo.dto.UserFavoriteQueryDTO;
import byx.web.bookstore.pojo.vo.FavoriteVO;

public interface FavoriteService {
    PageInfo<FavoriteVO> getUserFavorites(UserFavoriteQueryDTO dto);
}
