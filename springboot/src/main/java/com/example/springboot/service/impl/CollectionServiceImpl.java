package com.example.springboot.service.impl;

import com.example.springboot.entity.Collection;
import com.example.springboot.mapper.CollectionMapper;
import com.example.springboot.service.ICollectionService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author 
 * @since 2022-11-14
 */
@Service
public class CollectionServiceImpl extends ServiceImpl<CollectionMapper, Collection> implements ICollectionService {

}
