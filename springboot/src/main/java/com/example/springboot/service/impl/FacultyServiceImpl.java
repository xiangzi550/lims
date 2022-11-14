package com.example.springboot.service.impl;

import com.example.springboot.entity.Faculty;
import com.example.springboot.mapper.FacultyMapper;
import com.example.springboot.service.IFacultyService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author 
 * @since 2022-11-13
 */
@Service
public class FacultyServiceImpl extends ServiceImpl<FacultyMapper, Faculty> implements IFacultyService {

}
