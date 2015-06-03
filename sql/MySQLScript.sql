CREATE DATABASE `test`;

CREATE TABLE `product` (
  `product_id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(128) NOT NULL,
  `description` varchar(512) NOT NULL,
  `price` float NOT NULL,
  PRIMARY KEY (`product_id`)
)

CREATE TABLE "TWILIO_CALL"(
  Sid VARCHAR2(34), 
  ParentCallSid VARCHAR2(34),
  DateCreated Date,
  DateUpdated Date,
  AccountSid VARCHAR2(34),
  From_NUMBER VARCHAR2(34) NOT NULL,
  To VARCHAR2(34) NOT NULL,
  PhoneNumberSid VARCHAR2(34),
  Status VARCHAR2(12),
  StartTime Date,
  EndTime Date,
  Duration INT,
  Price NUMBER(10),
  PriceUnit VARCHAR2(10),
  Direction VARCHAR2(20),
  AnsweredBy VARCHAR2(10),
  ForwardedFrom VARCHAR2(34),
  CallerName VARCHAR2(64),
  Uri VARCHAR2(255)
);

CREATE TABLE "TWILIO_MESSAGE"(
  Sid VARCHAR2(34), 
  DateCreated Date,
  DateUpdated Date,
  DateSent Date,
  AccountSid VARCHAR2(34),
  From_NUMBER VARCHAR2(34) NOT NULL,
  To VARCHAR2(34) NOT NULL,
  Body VARCHAR2(1600),
  NumMedia int(2),
  NumSegments int(8),
  Status VARCHAR2(12),
  ErrorCode int(8),
  ErrorMessage VARCHAR2(64),
  Direction VARCHAR2(20),
  Price NUMBER(10),
  PriceUnit VARCHAR2(10),
  ApiVersion VARCHAR2(32),
  Uri VARCHAR2(255),
  SubresourceUri VARCHAR2(255)
);

CREATE TABLE "TWILIO_ERRORNOTIFICATION"(
  Sid VARCHAR2(34), 
  DateCreated Date,
  DateUpdated Date,
  AccountSid VARCHAR2(34),
  CallSid VARCHAR2(34),
  ApiVersion VARCHAR2(32),
  Log_level int(1),
  ErrorCode int(8),
  MoreInfo VARCHAR2(255),
  MessageText VARCHAR2(1600),
  MessageDate Date,
  RequestUrl VARCHAR2(255),
  RequestMethod VARCHAR2(64),
  RequestVariables VARCHAR2(255),
  ResponseHeaders VARCHAR2(1600),
  ResponseBody VARCHAR2(1600),
  Uri VARCHAR2(255)
);

CREATE TABLE "TWILIO_ACCOUNT"(
  Sid VARCHAR2(34), 
  DateCreated Date,
  DateUpdated Date,
  FriendlyName VARCHAR2(64),
  Type VARCHAR2(6),
  Status VARCHAR2(10),
  AuthToken VARCHAR2(64), 
  Uri VARCHAR2(255),
  SubresourceUris VARCHAR2(255),
  OwnerAccountSid VARCHAR2(34)
);

CREATE TABLE "TWILIO_PHONENUMBERS"(
  Sid VARCHAR2(34), 
  DateCreated Date,
  DateUpdated Date,
  FriendlyName VARCHAR2(64),
  AccountSid VARCHAR2(34),
  PhoneNumberSid VARCHAR2(34),
  ApiVersion VARCHAR2(32),
  VoiceCallerIdLookup Bool,
  VoiceUrl VARCHAR2(255),
  VoiceMethod VARCHAR2(4),
  VoiceFallbackUrl VARCHAR2(255),
  VoiceFallbackMethod VARCHAR2(4),
  StatusCallback VARCHAR2(255),
  StatusCallbackMethod VARCHAR2(4),
  VoiceApplicationSid VARCHAR2(34),
  SmsUrl VARCHAR2(255),
  SmsMethod VARCHAR2(4),
  SmsFallbackUrl VARCHAR2(255),
  SmsFallbackMethod VARCHAR2(4),
  SmsApplicationSid VARCHAR2(34),
  Capabilities VARCHAR2(34),
  AddressRequirements VARCHAR2(8),
  Uri VARCHAR2(255)
);
