package byx.web.bookstore.mapper;

import byx.web.bookstore.pojo.dto.UserFavoriteQueryDTO;
import byx.web.bookstore.pojo.vo.FavoriteVO;

import java.util.List;

public interface FavoriteMapper {
    List<FavoriteVO> listByUser(UserFavoriteQueryDTO dto);
    int countOfUser(UserFavoriteQueryDTO dto);
}
