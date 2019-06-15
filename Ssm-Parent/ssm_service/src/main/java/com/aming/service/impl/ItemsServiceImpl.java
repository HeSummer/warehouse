package com.aming.service.impl;

import com.aming.mapper.ItemsMapper;
import com.aming.pojo.Items;
import com.aming.service.ItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ItemsServiceImpl implements ItemsService {
    @Autowired
    private ItemsMapper itemsMapper;

    @Override
    public Items findItems(Integer id) {
        Items items = itemsMapper.findItems(id);
        System.out.println("mapper:"+items);
        return items;
    }
}
