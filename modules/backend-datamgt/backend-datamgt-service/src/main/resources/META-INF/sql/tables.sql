create table m_fileattach (
	fileAttachId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	className VARCHAR(75) null,
	classPK VARCHAR(75) null,
	fullName VARCHAR(75) null,
	email VARCHAR(75) null,
	fileEntryId LONG,
	source VARCHAR(75) null,
	sourceUrl VARCHAR(75) null,
	docFileId LONG,
	fileName VARCHAR(75) null
);

create table opencps_comment (
	uuid_ VARCHAR(75) null,
	commentId LONG not null primary key,
	companyId LONG,
	groupId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	className VARCHAR(75) null,
	classPK VARCHAR(75) null,
	fullname VARCHAR(75) null,
	email VARCHAR(75) null,
	parent LONG,
	content VARCHAR(75) null,
	fileEntryId LONG,
	pings VARCHAR(75) null,
	upvoteCount INTEGER,
	userHasUpvoted VARCHAR(75) null,
	upvotedUsers VARCHAR(75) null,
	opinion BOOLEAN
);

create table opencps_dictcollection (
	uuid_ VARCHAR(75) null,
	dictCollectionId LONG not null primary key,
	companyId LONG,
	groupId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	collectionCode VARCHAR(75) null,
	collectionName VARCHAR(75) null,
	collectionNameEN VARCHAR(75) null,
	description VARCHAR(75) null,
	dataForm VARCHAR(75) null,
	status INTEGER
);

create table opencps_dictgroup (
	uuid_ VARCHAR(75) null,
	dictGroupId LONG not null primary key,
	companyId LONG,
	groupId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	dictCollectionId LONG,
	groupCode VARCHAR(75) null,
	groupName VARCHAR(75) null,
	groupNameEN VARCHAR(75) null,
	groupDescription VARCHAR(75) null
);

create table opencps_dictitem (
	uuid_ VARCHAR(75) null,
	dictItemId LONG not null primary key,
	companyId LONG,
	groupId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	dictCollectionId LONG,
	itemCode VARCHAR(75) null,
	itemName VARCHAR(75) null,
	itemNameEN VARCHAR(75) null,
	itemDescription VARCHAR(75) null,
	parentItemId LONG,
	level INTEGER,
	sibling VARCHAR(75) null,
	treeIndex VARCHAR(75) null,
	metaData VARCHAR(75) null
);

create table opencps_dictitemgroup (
	uuid_ VARCHAR(75) null,
	dictItemGroupId LONG not null primary key,
	companyId LONG,
	groupId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	dictGroupId LONG,
	dictItemId LONG,
	dictGroupName VARCHAR(75) null
);

create table opencps_holiday (
	uuid_ VARCHAR(75) null,
	holidayId LONG not null primary key,
	companyId LONG,
	groupId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	holidayDate DATE null,
	description VARCHAR(75) null
);

create table opencps_voting (
	uuid_ VARCHAR(75) null,
	votingId LONG not null primary key,
	companyId LONG,
	groupId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	className VARCHAR(75) null,
	classPK VARCHAR(75) null,
	subject VARCHAR(75) null,
	choices VARCHAR(75) null,
	templateNo VARCHAR(75) null,
	commentable BOOLEAN
);

create table opencps_votingresult (
	uuid_ VARCHAR(75) null,
	votingResultId LONG not null primary key,
	companyId LONG,
	groupId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	votingId LONG,
	fullname VARCHAR(75) null,
	email VARCHAR(75) null,
	comment_ VARCHAR(75) null,
	selected VARCHAR(75) null
);

create table opencps_workTime (
	uuid_ VARCHAR(75) null,
	workTimeId LONG not null primary key,
	companyId LONG,
	groupId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	day INTEGER,
	hours VARCHAR(75) null
);