package cn.meshed.cloud.rd.project;

import cn.meshed.cloud.rd.project.command.ModelCmd;
import cn.meshed.cloud.rd.project.data.ModelDTO;
import cn.meshed.cloud.rd.project.data.ModelDetailDTO;
import cn.meshed.cloud.rd.project.data.ModelReleaseCountDTO;
import cn.meshed.cloud.rd.project.data.ServiceReleaseCountDTO;
import cn.meshed.cloud.rd.project.query.ModelAvailableKeyQry;
import cn.meshed.cloud.rd.project.query.ModelPageQry;
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
import java.util.List;
import java.util.Set;

/**
 * <h1>数据模型适配器</h1>
 *
 * @author Vincent Vic
 * @version 1.0
 */
@RequestMapping("/model")
public interface ModelAdapter {

    /**
     * 列表
     *
     * @param modelPageQry 模型分页查询
     * @return {@link PageResponse<ModelDTO>}
     */
    @Operation(summary = "模型列表")
    @GetMapping("/list/{projectKey}")
    PageResponse<ModelDTO> list(@Parameter(description = "项目唯一标识") @PathVariable("projectKey") String projectKey, @Parameter(description = "") @Valid ModelPageQry modelPageQry);

    /**
     * 详情
     *
     * @param uuid 项目唯一标识
     * @return {@link SingleResponse<ModelDetailDTO>}
     */
    @Operation(summary = "模型详情")
    @GetMapping("/details/{uuid}")
    SingleResponse<ModelDetailDTO> details(@Parameter(description = "模型通用编码") @PathVariable("uuid") String uuid);

    /**
     * 保存功能
     *
     * @param modelCmd 模型数据
     * @return {@link Response}
     */
    @Operation(summary = "模型保存")
    @PostMapping("/save")
    Response save(@Parameter(description = "模型操作数据") @Valid @RequestBody ModelCmd modelCmd);

    /**
     * 检查英文名是否合法
     *
     * @param modelAvailableKeyQry 检查参数
     * @return {@link Response}
     */
    @Operation(summary = "检查模型英文标识")
    @GetMapping("/available/key")
    Response availableKey(@Parameter(description = "模型英文标识查询参数") @Valid ModelAvailableKeyQry modelAvailableKeyQry);

    /**
     * 模型选项
     *
     * @param projectKey 项目唯一标识
     * @return {@link SingleResponse< List <String>>}
     */
    @Operation(summary = "模型选项")
    @GetMapping("/select/{projectKey}")
    SingleResponse<Set<String>> select(@Parameter(description = "项目唯一标识") @PathVariable("projectKey") String projectKey);

    /**
     * jar统计
     *
     * @param projectKey 项目唯一标识
     * @return {@link SingleResponse< ServiceReleaseCountDTO >}
     */
    @Operation(summary = "版本情况条件")
    @GetMapping("/release/count/{projectKey}")
    SingleResponse<ModelReleaseCountDTO> releaseCount(@Parameter(description = "项目唯一标识") @PathVariable("projectKey") String projectKey);

    /**
     * 完成模型
     *
     * @param uuid 模型编码
     * @return {@link Response}
     */
    @Operation(summary = "完成模型")
    @PostMapping("/complete/{uuid}")
    Response complete(@Parameter(description = "UUID") @PathVariable("uuid") String uuid);

    /**
     * 撤销完成
     *
     * @param uuid 模型编码
     * @return {@link Response}
     */
    @Operation(summary = "撤销完成")
    @PostMapping("/revoke/{uuid}")
    Response revoke(@Parameter(description = "UUID") @PathVariable("uuid") String uuid);

    /**
     * 废弃
     *
     * @param uuid 模型编码
     * @return {@link Response}
     */
    @Operation(summary = "废弃")
    @PostMapping("/discard/{uuid}")
    Response discard(@Parameter(description = "UUID") @PathVariable("uuid") String uuid);

    /**
     * 删除（仅支持编辑中的模型）
     *
     * @param uuid 模型编码
     * @return {@link Response}
     */
    @Operation(summary = "删除（仅支持编辑中的模型）")
    @DeleteMapping("/delete/{uuid}")
    Response delete(@Parameter(description = "UUID") @PathVariable("uuid") String uuid);
}
