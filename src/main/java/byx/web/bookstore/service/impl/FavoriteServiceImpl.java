package byx.web.bookstore.service.impl;

import byx.web.bookstore.common.PageInfo;
import byx.web.bookstore.mapper.FavoriteMapper;
import byx.web.bookstore.pojo.dto.FavoriteBookDTO;
import byx.web.bookstore.pojo.dto.UserFavoriteQueryDTO;
import byx.web.bookstore.pojo.vo.FavoriteVO;
import byx.web.bookstore.service.FavoriteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FavoriteServiceImpl implements FavoriteService {
    @Autowired
    private FavoriteMapper favoriteMapper;

    @Override
    public PageInfo<FavoriteVO> getUserFavorites(UserFavoriteQueryDTO dto) {
        List<FavoriteVO> vos = favoriteMapper.listByUser(dto);
        int count = favoriteMapper.countOfUser(dto);
        return new PageInfo<>(vos, dto.getPageSize(), dto.getCurrentPage(), count);
    }

    @Override
    public boolean isFavorite(FavoriteBookDTO dto) {
        return favoriteMapper.countOfUserAndBook(dto) > 0;
    }
}
