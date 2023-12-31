<?php
/**
 * Autogenerated by Thrift Compiler (0.14.1)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
use Thrift\Base\TBase;
use Thrift\Type\TType;
use Thrift\Type\TMessageType;
use Thrift\Exception\TException;
use Thrift\Exception\TProtocolException;
use Thrift\Protocol\TProtocol;
use Thrift\Protocol\TBinaryProtocolAccelerated;
use Thrift\Exception\TApplicationException;

final class TGetInfoType
{
    const CLI_MAX_DRIVER_CONNECTIONS = 0;

    const CLI_MAX_CONCURRENT_ACTIVITIES = 1;

    const CLI_DATA_SOURCE_NAME = 2;

    const CLI_FETCH_DIRECTION = 8;

    const CLI_SERVER_NAME = 13;

    const CLI_SEARCH_PATTERN_ESCAPE = 14;

    const CLI_DBMS_NAME = 17;

    const CLI_DBMS_VER = 18;

    const CLI_ACCESSIBLE_TABLES = 19;

    const CLI_ACCESSIBLE_PROCEDURES = 20;

    const CLI_CURSOR_COMMIT_BEHAVIOR = 23;

    const CLI_DATA_SOURCE_READ_ONLY = 25;

    const CLI_DEFAULT_TXN_ISOLATION = 26;

    const CLI_IDENTIFIER_CASE = 28;

    const CLI_IDENTIFIER_QUOTE_CHAR = 29;

    const CLI_MAX_COLUMN_NAME_LEN = 30;

    const CLI_MAX_CURSOR_NAME_LEN = 31;

    const CLI_MAX_SCHEMA_NAME_LEN = 32;

    const CLI_MAX_CATALOG_NAME_LEN = 34;

    const CLI_MAX_TABLE_NAME_LEN = 35;

    const CLI_SCROLL_CONCURRENCY = 43;

    const CLI_TXN_CAPABLE = 46;

    const CLI_USER_NAME = 47;

    const CLI_TXN_ISOLATION_OPTION = 72;

    const CLI_INTEGRITY = 73;

    const CLI_GETDATA_EXTENSIONS = 81;

    const CLI_NULL_COLLATION = 85;

    const CLI_ALTER_TABLE = 86;

    const CLI_ORDER_BY_COLUMNS_IN_SELECT = 90;

    const CLI_SPECIAL_CHARACTERS = 94;

    const CLI_MAX_COLUMNS_IN_GROUP_BY = 97;

    const CLI_MAX_COLUMNS_IN_INDEX = 98;

    const CLI_MAX_COLUMNS_IN_ORDER_BY = 99;

    const CLI_MAX_COLUMNS_IN_SELECT = 100;

    const CLI_MAX_COLUMNS_IN_TABLE = 101;

    const CLI_MAX_INDEX_SIZE = 102;

    const CLI_MAX_ROW_SIZE = 104;

    const CLI_MAX_STATEMENT_LEN = 105;

    const CLI_MAX_TABLES_IN_SELECT = 106;

    const CLI_MAX_USER_NAME_LEN = 107;

    const CLI_OJ_CAPABILITIES = 115;

    const CLI_XOPEN_CLI_YEAR = 10000;

    const CLI_CURSOR_SENSITIVITY = 10001;

    const CLI_DESCRIBE_PARAMETER = 10002;

    const CLI_CATALOG_NAME = 10003;

    const CLI_COLLATION_SEQ = 10004;

    const CLI_MAX_IDENTIFIER_LEN = 10005;

    static public $__names = array(
        0 => 'CLI_MAX_DRIVER_CONNECTIONS',
        1 => 'CLI_MAX_CONCURRENT_ACTIVITIES',
        2 => 'CLI_DATA_SOURCE_NAME',
        8 => 'CLI_FETCH_DIRECTION',
        13 => 'CLI_SERVER_NAME',
        14 => 'CLI_SEARCH_PATTERN_ESCAPE',
        17 => 'CLI_DBMS_NAME',
        18 => 'CLI_DBMS_VER',
        19 => 'CLI_ACCESSIBLE_TABLES',
        20 => 'CLI_ACCESSIBLE_PROCEDURES',
        23 => 'CLI_CURSOR_COMMIT_BEHAVIOR',
        25 => 'CLI_DATA_SOURCE_READ_ONLY',
        26 => 'CLI_DEFAULT_TXN_ISOLATION',
        28 => 'CLI_IDENTIFIER_CASE',
        29 => 'CLI_IDENTIFIER_QUOTE_CHAR',
        30 => 'CLI_MAX_COLUMN_NAME_LEN',
        31 => 'CLI_MAX_CURSOR_NAME_LEN',
        32 => 'CLI_MAX_SCHEMA_NAME_LEN',
        34 => 'CLI_MAX_CATALOG_NAME_LEN',
        35 => 'CLI_MAX_TABLE_NAME_LEN',
        43 => 'CLI_SCROLL_CONCURRENCY',
        46 => 'CLI_TXN_CAPABLE',
        47 => 'CLI_USER_NAME',
        72 => 'CLI_TXN_ISOLATION_OPTION',
        73 => 'CLI_INTEGRITY',
        81 => 'CLI_GETDATA_EXTENSIONS',
        85 => 'CLI_NULL_COLLATION',
        86 => 'CLI_ALTER_TABLE',
        90 => 'CLI_ORDER_BY_COLUMNS_IN_SELECT',
        94 => 'CLI_SPECIAL_CHARACTERS',
        97 => 'CLI_MAX_COLUMNS_IN_GROUP_BY',
        98 => 'CLI_MAX_COLUMNS_IN_INDEX',
        99 => 'CLI_MAX_COLUMNS_IN_ORDER_BY',
        100 => 'CLI_MAX_COLUMNS_IN_SELECT',
        101 => 'CLI_MAX_COLUMNS_IN_TABLE',
        102 => 'CLI_MAX_INDEX_SIZE',
        104 => 'CLI_MAX_ROW_SIZE',
        105 => 'CLI_MAX_STATEMENT_LEN',
        106 => 'CLI_MAX_TABLES_IN_SELECT',
        107 => 'CLI_MAX_USER_NAME_LEN',
        115 => 'CLI_OJ_CAPABILITIES',
        10000 => 'CLI_XOPEN_CLI_YEAR',
        10001 => 'CLI_CURSOR_SENSITIVITY',
        10002 => 'CLI_DESCRIBE_PARAMETER',
        10003 => 'CLI_CATALOG_NAME',
        10004 => 'CLI_COLLATION_SEQ',
        10005 => 'CLI_MAX_IDENTIFIER_LEN',
    );
}

