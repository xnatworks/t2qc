package org.neuroinfo.t2qc;

import org.nrg.framework.annotations.XnatDataModel;
import org.nrg.framework.annotations.XnatPlugin;

@XnatPlugin(value = "t2qcPlugin", name = "T2QC Plugin",
            description = "Provides the T2QC (neuroinfo:t2qc) data type and report page.",
            dataModels = {@XnatDataModel(value = "neuroinfo:t2qc", singular = "T2QC", plural = "T2QCs")})
public class T2qcPlugin {
}
