package cn.meshed.cloud.rd.deployment;

import cn.meshed.cloud.rd.deployment.command.PackagesCmd;
import cn.meshed.cloud.rd.deployment.data.PackagesDTO;
import cn.meshed.cloud.rd.deployment.query.PackagesPageQry;
import com.alibaba.cola.dto.PageResponse;
import com.alibaba.cola.dto.Response;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

/**
 * <h1>制品</h1>
 *
 * @author Vincent Vic
 * @version 1.0
 */
@RequestMapping("/packages")
public interface PackagesAdapter {

    /**
     * 列表
     *
     * @param packagesPageQry 制品分页查询
     * @return {@link PageResponse <PackagesDTO>}
     */
    @Operation(summary = "制品列表")
    @GetMapping("/list")
    PageResponse<PackagesDTO> list(@Parameter(description = "分页参数") @Valid PackagesPageQry packagesPageQry);

    /**
     * 保存
     * @param packagesCmd 新增制品
     * @return {@link Response}
     */
    @Operation(summary = "制品列表")
    @PutMapping("/save")
    Response save(@Parameter(description = "保存参数") @RequestBody PackagesCmd packagesCmd);
}
