package com.javakc.springbootssm.user.controller;


import com.javakc.springbootssm.user.entity.User;
import com.javakc.springbootssm.user.service.UserService;
import io.swagger.annotations.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import springfox.documentation.annotations.ApiIgnore;

import java.util.List;

@RestController
@RequestMapping("user")
@Api(value = "[系统管理] [用户接口]")
public class UserController {

    @Autowired
    private UserService userService;

    //@PostMapping      添加     RequestMethod.POST
    //@GetMapping       查询     RequestMethod.GET
    //@PutMapping       修改     RequestMethod.PUT
    //@DeleteMapping    删除     RequestMethod.DELETE

    @PostMapping(produces = "application/json",consumes = "application/json")
    @ApiOperation(value = "用户添加接口")
    @ApiImplicitParams(
            value = {
                @ApiImplicitParam(name = "id",value = "主键(添加无需干扰)",required = false),
                @ApiImplicitParam(name = "name",value = "姓名(必填)",dataType = "字符串",example = "张三",required = true),
                @ApiImplicitParam(name = "name",value = "年龄(必填)",dataType = "正整数且大于18岁",example = "21",required = true),
                @ApiImplicitParam(name = "birthday",value = "出生日期(必填)",dataType = "年-月-日",example = "1999-10-21",required = true),
                @ApiImplicitParam(name = "address",value = "家庭地址",example = "xxx三单元五层502",dataType = "需要精确到门牌号")
            }
    )
    public  void  insert(@RequestBody @ApiIgnore User user)
    {
        System.out.println("[系统管理-用户管理-用户添加]"+user);
    }

    /**
     * springboot  -> spring security
     * @param id
     * @return
     */

    @GetMapping(value = "{id}",consumes = "application/json",produces = "application/json")
    @ApiOperation(value = "[主键查询]",notes = "主键ID必填信息")
    public User get(@ApiParam (name = "id",value = "用户主键",required = true,example = "1")@PathVariable int id)
    {
        return userService.queryById(id);
    }


    @GetMapping
    public List<User> query()
    {
        return userService.queryByPage();
    }

    @GetMapping("{id}")
    public User query(@PathVariable int id)
    {
        return userService.queryById(id);
    }

    @PutMapping
    public  void update(@RequestBody User user)
    {
        System.out.println("[系统管理-用户管理-用户修改]"+user);
    }

    @DeleteMapping("{id}")
    public void delete(@PathVariable int id)
    {
        System.out.println("[系统管理-用户管理-用户修改]"+id);
    }


}
