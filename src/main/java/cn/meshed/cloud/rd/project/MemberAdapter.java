package cn.meshed.cloud.rd.project;

import cn.meshed.cloud.rd.project.command.DomainCmd;
import cn.meshed.cloud.rd.project.command.MemberCmd;
import cn.meshed.cloud.rd.project.data.MemberDTO;
import cn.meshed.cloud.rd.project.data.ProjectDTO;
import cn.meshed.cloud.rd.project.query.ImportMemberPageQry;
import cn.meshed.cloud.rd.project.query.MemberPageQry;
import cn.meshed.cloud.rd.project.query.ProjectPageQry;
import com.alibaba.cola.dto.PageResponse;
import com.alibaba.cola.dto.Response;
import com.alibaba.cola.dto.SingleResponse;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;
import java.util.List;
import java.util.Set;

/**
 * <h1>成员适配器</h1>
 *
 * @author Vincent Vic
 * @version 1.0
 */
@RequestMapping("/member")
public interface MemberAdapter {

    /**
     * 列表
     *
     * @param memberPageQry 成员分页查询
     * @return {@link PageResponse<MemberDTO>}
     */
    @Operation(summary = "成员列表")
    @GetMapping("/list")
    PageResponse<MemberDTO> list(@Parameter(description = "分页参数") @Valid MemberPageQry memberPageQry);

    /**
     * 导入成员列表
     *
     * @param importMemberPageQry 成员导入分页查询
     * @return {@link PageResponse<MemberDTO>}
     */
    @Operation(summary = "成员列表")
    @GetMapping("/import/list")
    PageResponse<MemberDTO> importMemberList(@Parameter(description = "分页参数") @Valid ImportMemberPageQry importMemberPageQry);

    /**
     * 新增成员
     *
     * @param memberCmd 成员信息
     * @return {@link Response}
     */
    @Operation(summary = "新增成员")
    @PutMapping("/add")
    Response add(@Parameter(description = "新增参数") @Valid @RequestBody MemberCmd memberCmd);


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
