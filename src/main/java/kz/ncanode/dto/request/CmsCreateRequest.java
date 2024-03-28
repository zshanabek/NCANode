package kz.ncanode.dto.request;

import kz.ncanode.dto.tsp.TsaPolicy;
import lombok.Data;

import javax.validation.constraints.NotEmpty;
import java.util.List;

@Data
public class CmsCreateRequest {
    private List<String> cms;
    private List<String> data;

    @NotEmpty
    private List<SignerRequest> signers;

    private boolean withTsp = false;

    private TsaPolicy tsaPolicy;

    private boolean detached = false;
}
