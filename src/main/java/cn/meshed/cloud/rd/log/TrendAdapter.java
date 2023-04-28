package cn.meshed.cloud.rd.log;

import cn.meshed.cloud.rd.log.data.TrendDTO;
import cn.meshed.cloud.rd.log.query.TrendPageQry;
import com.alibaba.cola.dto.PageResponse;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

/**
 * <h1></h1>
 *
 * @author Vincent Vic
 * @version 1.0
 */
@RequestMapping("/trend")
public interface TrendAdapter {

    /**
     * 列表
     *
     * @param pageQry 分页参数
     * @return {@link PageResponse<TrendDTO>}
     */
    @Operation(summary = "服务列表")
    @GetMapping("/list/{projectKey}")
    PageResponse<TrendDTO> list(@Parameter(description = "项目唯一标识") @PathVariable("projectKey") String projectKey, @Parameter(description = "分页参数") @Valid TrendPageQry pageQry);

}
