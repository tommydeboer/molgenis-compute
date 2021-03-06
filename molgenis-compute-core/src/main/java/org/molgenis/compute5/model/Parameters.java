package org.molgenis.compute5.model;

import java.util.ArrayList;
import java.util.List;

import org.molgenis.data.support.MapEntity;

/** Container for all parameters */
public class Parameters
{
	//unique column used to distinguish the parameter rows provided
	
	// SOME OF THESE CONSTANTS SHOULD BE PLACED ELSEWHERE!



	public static final String STEP_HEADING_IN_WORKFLOW = "step";
	public static final String PROTOCOL_HEADING_IN_WORKFLOW = "protocol";
	public static final String PARAMETER_MAPPING_HEADING_IN_WORKFLOW = "dependencies";
	public static final String USER = "user";
	public static final String STEP_PARAM_SEP_PROTOCOL = ".";
	public static final String UNDERSCORE = "_";
	public static final String TRIPLE_UNDERSCORE = "___";
	public static final String STEP_PARAM_SEP_SCRIPT = "__has__";
	public static final String USER_PREFIX = USER + UNDERSCORE;
	public final static String ID_COLUMN = USER_PREFIX + Task.TASKID_COLUMN;
	public static final String WORKFLOW = "workflow";
	public static final String WORKFLOW_DEFAULT = "workflow.csv";
	public static final String WORKFLOW_CMNDLINE_OPTION = "w";
	public final static String WORKFLOW_COLUMN = USER_PREFIX + WORKFLOW;
	public static final String DEFAULTS = "defaults";
	public static final String DEFAULTS_DEFAULT = "defaults.csv";
	public static final String DEFAULTS_CMNDLINE_OPTION = "defaults";
	public static final String DEFAULTS_COLUMN = USER_PREFIX + DEFAULTS;
	public final static String PATH = "path";
	public final static String PATH_DEFAULT = ".";
	public final static String PATH_CMNDLINE_OPTION = "path";
	public final static String PATH_COLUMN = USER_PREFIX + PATH;
	public static final String PREVIOUS = "PREVIOUS";
	public static final String PREVIOUS_COLUMN = USER_PREFIX + PREVIOUS;
	public static final String PARAMETERS_CMNDLINE_OPTION = "p";
	public static final String PARAMETERS = "parameters";
	public static final String PARAMETERS_DEFAULT = "parameters.csv";
	// we may consider changing this to parameterFiles to make it more descriptive:
	public static final String PARAMETER_COLUMN = "parameters";
    public static final String CUSTOM_HEADER_COLUMN = "header";
    public static final String CUSTOM_FOOTER_COLUMN = "footer";
    public static final String CUSTOM_SUBMIT_COLUMN = "submit";
    public static final String CUSTOM_HEADER_DEFAULT = "header.ftl";
    public static final String CUSTOM_FOOTER_DEFAULT = "footer.ftl";
    public static final String CUSTOM_SUBMIT_DEFAULT = "submit.sh.ftl";
    public static final String ERROR_LOG = "errorlog"; // parameter name of log file
	public static final String ERROR_LOG_COLUMN = USER_PREFIX + ERROR_LOG;
	public static final String ERROR_FILE_DEFAULT = "error.log"; // can be changed by user parameter
	public static final String SOURCE_COMMAND = "source";
	public static final String ENVIRONMENT_DIR_VARIABLE = "$ENVIRONMENT_DIR"; // Update also header.ftl of ALL backends accordingly!
	public static final String ENVIRONMENT_EXTENSION = ".env";
	public static final String ENVIRONMENT = "user" + ENVIRONMENT_EXTENSION;
	public static final String NOTAVAILABLE = "notavailable";
	public static final String LIST_INPUT = "list";
	public static final String STRING = "string";
	public static final String WALLTIME = "walltime";
	public static final String QUEUE = "queue";
	public static final String NODES = "nodes";
	public static final String PPN = "ppn";
	public static final String MEMORY = "mem";
	public static final String BACKEND = "backend";
	public static final String BACKEND_CMNDLINE_OPTION = "b";
	public static final String BACKEND_COLUMN = USER_PREFIX + BACKEND;
	public static final String BACKEND_LOCAL = "localhost";
	public static final String BACKEND_PBS = "pbs";
	public static final String BACKEND_DEFAULT = BACKEND_LOCAL;
	public static final String RUNDIR = "rundir";
	public static final String RUNDIR_COLUMN = USER_PREFIX + RUNDIR;
	public static final String RUNDIR_DEFAULT = "rundir";
	public static final String RUNDIR_CMNDLINE_OPTION = "rundir";
	public static final String RUNID = "runid";
	public static final String RUNID_CMNDLINE_OPTION = "runid";
	public static final String RUNID_COLUMN = USER_PREFIX + RUNID;
	public static final String RUNID_DEFAULT = null; // if not set, then auto-generate unique
	public static final String DATABASE = "database";
	public static final String DATABASE_DEFAULT = "none";
	public static final String DATABASE_CMNDLINE_OPTION = "d";
	public static final String DATABASE_COLUMN = USER_PREFIX + DATABASE;
	public static final String DATABASE_START = "database-start";
	public static final String DATABASE_START_CMNDLINE_OPTION = "dbs";
	public static final String DATABASE_END = "database-end";
	public static final String DATABASE_END_CMNDLINE_OPTION = "dbe";
	public static final String PORT = "port";
	public static final String PORT_DEFAULT = "80";
	public static final String PORT_CMNDLINE_OPTION = "port";
	public static final String INTERVAL = "interval";
	public static final String INTERVAL_DEFAULT = "2000";
	public static final String INTERVAL_CMNDLINE_OPTION = "interval";
	public static final String PROPERTIES = ".compute.properties";
	public static final String GENERATE = "generate";
	public static final String GENERATE_CMNDLINE_OPTION = "g";
	public static final String LIST = "list";
	public static final String LIST_CMNDLINE_OPTION = "l";
	public static final String CREATE = "create";
	public static final String CREATE_WORKFLOW_DEFAULT = "myworkflow";
	public static final String HELP = "help";
	public static final String HELP_CMNDLINE_OPTION = "h";
	public static final String RUN = "run";
	public static final String RUN_CMNDLINE_OPTION = "r";
	public static final String MOLGENIS_USER_CMNDLINE = "molgenisuser";
	public static final String MOLGENIS_USER_CMNDLINE_OPTION = "mu";
	public static final String MOLGENIS_PASS_CMNDLINE = "molgenispassword";
	public static final String MOLGENIS_PASS_CMNDLINE_OPTION = "mpass";
	public static final String BACKEND_USER_CMNDLINE = "backenduser";
	public static final String BACKEND_USER_CMNDLINE_OPTION = "bu";
	public static final String BACKEND_PASS_CMNDLINE = "backendpassword";
	public static final String BACKEND_PASS_CMNDLINE_OPTION = "bp";
	public static final String AUTOGENERATED_ID = "autoid";

	public static final String PARAMETERS_TO_OVERWRITE_CMDLINE = "overwrite";
	public static final String PARAMETERS_TO_OVERWRITE_CMDLINE_OPTION = "o";

	public static final String CLEAR = "clear";

	public static final String WEAVE = "weave";
	public static final String WEB = "web";
	public static final String ERROR_MESSAGE_ADDR = "errorAddr";
	public static final String ERROR_MESSAGE_ADDR_OPTION = "e";
	public static final String DEFAULT_ERROR_ADDRESS = "none";

	public static final String BACKEND_URL = "url";
	public static final String BACKEND_URL_OPTION = "u";
	public static final String DEFAULT_BACKEND_URL = "none";

	public static final String BACKEND_TYPE_CLOUD = "cloud";
	public static final String BACKEND_TYPE_GRID = "grid";

	public static final String SCHEDULER_PBS = "pbs";
	public static final String SCHEDULER_SLURM = "slurm";


	public static String ENVIRONMENT_FULLPATH = null; // to be set

	//table with all the values
	List<MapEntity> values = new ArrayList<MapEntity>();

	public List<MapEntity> getValues()
	{
		return values;
	}

	public void setValues(List<MapEntity> values)
	{
		this.values = values;
	}

	public String toString()
	{
		String result = "";
		for (MapEntity t : values)
			result += t;
		return result;
	}

}
