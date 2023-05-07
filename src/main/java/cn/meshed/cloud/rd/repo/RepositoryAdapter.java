package cn.meshed.cloud.rd.repo;

import cn.meshed.cloud.rd.repo.data.RepositoryDTO;
import cn.meshed.cloud.rd.repo.data.RepositoryFileDTO;
import cn.meshed.cloud.rd.repo.query.RepositoryBlobQry;
import cn.meshed.cloud.rd.repo.query.RepositoryTreeQry;
import com.alibaba.cola.dto.MultiResponse;
import com.alibaba.cola.dto.SingleResponse;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * <h1></h1>
 *
 * @author Vincent Vic
 * @version 1.0
 */
@RequestMapping("/repo")
public interface RepositoryAdapter {

    /**
     * 查询代码库的文件树
     *
     * @param repositoryTreeQry 代码树查询参数
     * @return 文件树列表
     */
    @Operation(summary = "查询代码库的文件树")
    @GetMapping("/tree")
    MultiResponse<RepositoryFileDTO> listRepositoryTree(@Parameter(description = "代码树查询参数") RepositoryTreeQry repositoryTreeQry);

    /**
     * 详情
     *
     * @param repoId 物理仓库ID
     * @return {@link SingleResponse< RepositoryDTO >}
     */
    @Operation(summary = "详情")
    @GetMapping("/{repoId}")
    SingleResponse<RepositoryDTO> details(@Parameter(description = "物理仓库ID") @PathVariable("repoId") String repoId);

    /**
     * 详情
     *
     * @param repositoryBlobQry 文件查询参数
     * @return {@link SingleResponse< RepositoryDTO >}
     */
    @Operation(summary = "文件内容")
    @GetMapping("/blob")
    SingleResponse<String> blob(@Parameter(description = "文件查询参数") RepositoryBlobQry repositoryBlobQry);

}
