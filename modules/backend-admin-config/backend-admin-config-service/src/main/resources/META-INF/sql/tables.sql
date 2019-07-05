create table opencps_adminconfig (
	id_ LONG not null primary key,
	code_ VARCHAR(75) null,
	name VARCHAR(75) null,
	bundleName VARCHAR(75) null,
	modelName VARCHAR(75) null,
	serviceUtilName VARCHAR(75) null,
	headersName VARCHAR(75) null,
	columns VARCHAR(75) null,
	detailColumns VARCHAR(75) null,
	extForm BOOLEAN,
	groupFilter BOOLEAN,
	publicManager BOOLEAN
);

create table opencps_dynamicreport (
	dynamicReportId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	sharing INTEGER,
	reportName VARCHAR(75) null,
	reportCode VARCHAR(75) null,
	filterConfig TEXT null,
	tableConfig TEXT null,
	userConfig VARCHAR(1000) null,
	reportType VARCHAR(75) null
);