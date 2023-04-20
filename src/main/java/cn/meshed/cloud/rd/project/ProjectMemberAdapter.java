package cn.meshed.cloud.rd.project;

import cn.meshed.cloud.rd.project.command.MemberCmd;
import cn.meshed.cloud.rd.project.command.ProjectMemberCmd;
import cn.meshed.cloud.rd.project.data.MemberDTO;
import cn.meshed.cloud.rd.project.data.ProjectMemberDTO;
import cn.meshed.cloud.rd.project.query.MemberPageQry;
import cn.meshed.cloud.rd.project.query.ProjectMemberPageQry;
import com.alibaba.cola.dto.PageResponse;
import com.alibaba.cola.dto.Response;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

/**
 * <h1>项目成员成员适配器</h1>
 *
 * @author Vincent Vic
 * @version 1.0
 */
@RequestMapping("/project/member")
public interface ProjectMemberAdapter {

    /**
     * 列表
     *
     * @param projectMemberPageQry 成员分页查询
     * @return {@link PageResponse<MemberDTO>}
     */
    @Operation(summary = "项目成员列表")
    @GetMapping("/list")
    PageResponse<ProjectMemberDTO> list(@Parameter(description = "分页参数") @Valid ProjectMemberPageQry projectMemberPageQry);

    /**
     * 新增项目成员成员
     *
     * @param projectMemberCmd 项目成员成员信息
     * @return {@link Response}
     */
    @Operation(summary = "新增成员")
    @PutMapping("/add")
    Response add(@Parameter(description = "新增参数") @Valid @RequestBody ProjectMemberCmd projectMemberCmd);


    /**
     * 删除成员
     *
     * @param id 成员ID
     * @return {@link Response}
     */
    @Operation(summary = "删除成员")
    @DeleteMapping("/delete/{id}")
    Response delete(@Parameter(description = "成员ID") @PathVariable("id") Integer id);

}
