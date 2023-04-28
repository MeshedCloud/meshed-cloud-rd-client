package cn.meshed.cloud.rd.project;

import cn.meshed.cloud.rd.project.command.ServiceCmd;
import cn.meshed.cloud.rd.project.data.ServiceDTO;
import cn.meshed.cloud.rd.project.data.ServiceDetailDTO;
import cn.meshed.cloud.rd.project.data.ServiceReleaseCountDTO;
import cn.meshed.cloud.rd.project.query.ServiceAvailableMethodQry;
import cn.meshed.cloud.rd.project.query.ServicePageQry;
import com.alibaba.cola.dto.PageResponse;
import com.alibaba.cola.dto.Response;
import com.alibaba.cola.dto.SingleResponse;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

/**
 * <h1>服务适配器</h1>
 *
 * @author Vincent Vic
 * @version 1.0
 */
@RequestMapping("/service")
public interface ServiceAdapter {

    /**
     * 列表
     *
     * @param servicePageQry
     * @return {@link PageResponse<ServiceDTO>}
     */
    @Operation(summary = "服务列表")
    @GetMapping("/list/{projectKey}")
    PageResponse<ServiceDTO> list(@Parameter(description = "项目唯一标识") @PathVariable("projectKey") String projectKey, @Parameter(description = "分页参数") @Valid ServicePageQry servicePageQry);

    /**
     * 详情
     *
     * @param uuid 服务uuid
     * @return {@link SingleResponse<ServiceDetailDTO>}
     */
    @Operation(summary = "服务详情")
    @GetMapping("/details/{uuid}")
    SingleResponse<ServiceDetailDTO> details(@Parameter(description = "服务通用编码") @PathVariable("uuid") String uuid);

    /**
     * 保存功能
     *
     * @param serviceCmd 服务数据
     * @return {@link Response}
     */
    @Operation(summary = "服务保存")
    @PostMapping("/save")
    Response save(@Parameter(description = "服务操作对象") @Valid @RequestBody ServiceCmd serviceCmd);

    /**
     * jar统计
     *
     * @param projectKey 项目唯一标识
     * @return {@link SingleResponse<ServiceReleaseCountDTO>}
     */
    @Operation(summary = "版本情况条件")
    @GetMapping("/release/count/{projectKey}")
    SingleResponse<ServiceReleaseCountDTO> releaseCount(@Parameter(description = "项目唯一标识") @PathVariable("projectKey") String projectKey);

    /**
     * 检查方法是否可用（控制器中唯一性）
     *
     * @param serviceAvailableMethodQry 检查参数
     * @return {@link Response}
     */
    @Operation(summary = "检查方法是否可用")
    @GetMapping("/available/method/name")
    Response availableMethodName(@Parameter(description = "方法检查参数") @Valid ServiceAvailableMethodQry serviceAvailableMethodQry);

    /**
     * 完成服务
     *
     * @param uuid 服务编码
     * @return {@link Response}
     */
    @Operation(summary = "完成服务")
    @PostMapping("/complete/{uuid}")
    Response complete(@Parameter(description = "UUID") @PathVariable("uuid") String uuid);

    /**
     * 撤销完成
     *
     * @param uuid 服务编码
     * @return {@link Response}
     */
    @Operation(summary = "撤销完成")
    @PostMapping("/revoke/{uuid}")
    Response revoke(@Parameter(description = "UUID") @PathVariable("uuid") String uuid);

    /**
     * 废弃
     *
     * @param uuid 服务编码
     * @return {@link Response}
     */
    @Operation(summary = "废弃")
    @PostMapping("/discard/{uuid}")
    Response discard(@Parameter(description = "UUID") @PathVariable("uuid") String uuid);


    /**
     * 删除（仅支持编辑中的服务）
     *
     * @param uuid 服务编码
     * @return {@link Response}
     */
    @Operation(summary = "删除（仅支持编辑中的服务）")
    @DeleteMapping("/delete/{uuid}")
    Response delete(@Parameter(description = "UUID") @PathVariable("uuid") String uuid);
}
