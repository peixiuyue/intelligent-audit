

package com.ark.cloud.modules.sys.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ark.cloud.modules.sys.entity.SysCaptchaEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * 验证码
 *
 * @author peixiuyue
 */
@Mapper
public interface SysCaptchaDao extends BaseMapper<SysCaptchaEntity> {

}
