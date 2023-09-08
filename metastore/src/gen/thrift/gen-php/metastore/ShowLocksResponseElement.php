<?php
namespace metastore;

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

class ShowLocksResponseElement
{
    static public $isValidate = false;

    static public $_TSPEC = array(
        1 => array(
            'var' => 'lockid',
            'isRequired' => true,
            'type' => TType::I64,
        ),
        2 => array(
            'var' => 'dbname',
            'isRequired' => true,
            'type' => TType::STRING,
        ),
        3 => array(
            'var' => 'tablename',
            'isRequired' => false,
            'type' => TType::STRING,
        ),
        4 => array(
            'var' => 'partname',
            'isRequired' => false,
            'type' => TType::STRING,
        ),
        5 => array(
            'var' => 'state',
            'isRequired' => true,
            'type' => TType::I32,
            'class' => '\metastore\LockState',
        ),
        6 => array(
            'var' => 'type',
            'isRequired' => true,
            'type' => TType::I32,
            'class' => '\metastore\LockType',
        ),
        7 => array(
            'var' => 'txnid',
            'isRequired' => false,
            'type' => TType::I64,
        ),
        8 => array(
            'var' => 'lastheartbeat',
            'isRequired' => true,
            'type' => TType::I64,
        ),
        9 => array(
            'var' => 'acquiredat',
            'isRequired' => false,
            'type' => TType::I64,
        ),
        10 => array(
            'var' => 'user',
            'isRequired' => true,
            'type' => TType::STRING,
        ),
        11 => array(
            'var' => 'hostname',
            'isRequired' => true,
            'type' => TType::STRING,
        ),
        12 => array(
            'var' => 'heartbeatCount',
            'isRequired' => false,
            'type' => TType::I32,
        ),
        13 => array(
            'var' => 'agentInfo',
            'isRequired' => false,
            'type' => TType::STRING,
        ),
        14 => array(
            'var' => 'blockedByExtId',
            'isRequired' => false,
            'type' => TType::I64,
        ),
        15 => array(
            'var' => 'blockedByIntId',
            'isRequired' => false,
            'type' => TType::I64,
        ),
        16 => array(
            'var' => 'lockIdInternal',
            'isRequired' => false,
            'type' => TType::I64,
        ),
    );

    /**
     * @var int
     */
    public $lockid = null;
    /**
     * @var string
     */
    public $dbname = null;
    /**
     * @var string
     */
    public $tablename = null;
    /**
     * @var string
     */
    public $partname = null;
    /**
     * @var int
     */
    public $state = null;
    /**
     * @var int
     */
    public $type = null;
    /**
     * @var int
     */
    public $txnid = null;
    /**
     * @var int
     */
    public $lastheartbeat = null;
    /**
     * @var int
     */
    public $acquiredat = null;
    /**
     * @var string
     */
    public $user = null;
    /**
     * @var string
     */
    public $hostname = null;
    /**
     * @var int
     */
    public $heartbeatCount = 0;
    /**
     * @var string
     */
    public $agentInfo = null;
    /**
     * @var int
     */
    public $blockedByExtId = null;
    /**
     * @var int
     */
    public $blockedByIntId = null;
    /**
     * @var int
     */
    public $lockIdInternal = null;

    public function __construct($vals = null)
    {
        if (is_array($vals)) {
            if (isset($vals['lockid'])) {
                $this->lockid = $vals['lockid'];
            }
            if (isset($vals['dbname'])) {
                $this->dbname = $vals['dbname'];
            }
            if (isset($vals['tablename'])) {
                $this->tablename = $vals['tablename'];
            }
            if (isset($vals['partname'])) {
                $this->partname = $vals['partname'];
            }
            if (isset($vals['state'])) {
                $this->state = $vals['state'];
            }
            if (isset($vals['type'])) {
                $this->type = $vals['type'];
            }
            if (isset($vals['txnid'])) {
                $this->txnid = $vals['txnid'];
            }
            if (isset($vals['lastheartbeat'])) {
                $this->lastheartbeat = $vals['lastheartbeat'];
            }
            if (isset($vals['acquiredat'])) {
                $this->acquiredat = $vals['acquiredat'];
            }
            if (isset($vals['user'])) {
                $this->user = $vals['user'];
            }
            if (isset($vals['hostname'])) {
                $this->hostname = $vals['hostname'];
            }
            if (isset($vals['heartbeatCount'])) {
                $this->heartbeatCount = $vals['heartbeatCount'];
            }
            if (isset($vals['agentInfo'])) {
                $this->agentInfo = $vals['agentInfo'];
            }
            if (isset($vals['blockedByExtId'])) {
                $this->blockedByExtId = $vals['blockedByExtId'];
            }
            if (isset($vals['blockedByIntId'])) {
                $this->blockedByIntId = $vals['blockedByIntId'];
            }
            if (isset($vals['lockIdInternal'])) {
                $this->lockIdInternal = $vals['lockIdInternal'];
            }
        }
    }

    public function getName()
    {
        return 'ShowLocksResponseElement';
    }


    public function read($input)
    {
        $xfer = 0;
        $fname = null;
        $ftype = 0;
        $fid = 0;
        $xfer += $input->readStructBegin($fname);
        while (true) {
            $xfer += $input->readFieldBegin($fname, $ftype, $fid);
            if ($ftype == TType::STOP) {
                break;
            }
            switch ($fid) {
                case 1:
                    if ($ftype == TType::I64) {
                        $xfer += $input->readI64($this->lockid);
                    } else {
                        $xfer += $input->skip($ftype);
                    }
                    break;
                case 2:
                    if ($ftype == TType::STRING) {
                        $xfer += $input->readString($this->dbname);
                    } else {
                        $xfer += $input->skip($ftype);
                    }
                    break;
                case 3:
                    if ($ftype == TType::STRING) {
                        $xfer += $input->readString($this->tablename);
                    } else {
                        $xfer += $input->skip($ftype);
                    }
                    break;
                case 4:
                    if ($ftype == TType::STRING) {
                        $xfer += $input->readString($this->partname);
                    } else {
                        $xfer += $input->skip($ftype);
                    }
                    break;
                case 5:
                    if ($ftype == TType::I32) {
                        $xfer += $input->readI32($this->state);
                    } else {
                        $xfer += $input->skip($ftype);
                    }
                    break;
                case 6:
                    if ($ftype == TType::I32) {
                        $xfer += $input->readI32($this->type);
                    } else {
                        $xfer += $input->skip($ftype);
                    }
                    break;
                case 7:
                    if ($ftype == TType::I64) {
                        $xfer += $input->readI64($this->txnid);
                    } else {
                        $xfer += $input->skip($ftype);
                    }
                    break;
                case 8:
                    if ($ftype == TType::I64) {
                        $xfer += $input->readI64($this->lastheartbeat);
                    } else {
                        $xfer += $input->skip($ftype);
                    }
                    break;
                case 9:
                    if ($ftype == TType::I64) {
                        $xfer += $input->readI64($this->acquiredat);
                    } else {
                        $xfer += $input->skip($ftype);
                    }
                    break;
                case 10:
                    if ($ftype == TType::STRING) {
                        $xfer += $input->readString($this->user);
                    } else {
                        $xfer += $input->skip($ftype);
                    }
                    break;
                case 11:
                    if ($ftype == TType::STRING) {
                        $xfer += $input->readString($this->hostname);
                    } else {
                        $xfer += $input->skip($ftype);
                    }
                    break;
                case 12:
                    if ($ftype == TType::I32) {
                        $xfer += $input->readI32($this->heartbeatCount);
                    } else {
                        $xfer += $input->skip($ftype);
                    }
                    break;
                case 13:
                    if ($ftype == TType::STRING) {
                        $xfer += $input->readString($this->agentInfo);
                    } else {
                        $xfer += $input->skip($ftype);
                    }
                    break;
                case 14:
                    if ($ftype == TType::I64) {
                        $xfer += $input->readI64($this->blockedByExtId);
                    } else {
                        $xfer += $input->skip($ftype);
                    }
                    break;
                case 15:
                    if ($ftype == TType::I64) {
                        $xfer += $input->readI64($this->blockedByIntId);
                    } else {
                        $xfer += $input->skip($ftype);
                    }
                    break;
                case 16:
                    if ($ftype == TType::I64) {
                        $xfer += $input->readI64($this->lockIdInternal);
                    } else {
                        $xfer += $input->skip($ftype);
                    }
                    break;
                default:
                    $xfer += $input->skip($ftype);
                    break;
            }
            $xfer += $input->readFieldEnd();
        }
        $xfer += $input->readStructEnd();
        return $xfer;
    }

    public function write($output)
    {
        $xfer = 0;
        $xfer += $output->writeStructBegin('ShowLocksResponseElement');
        if ($this->lockid !== null) {
            $xfer += $output->writeFieldBegin('lockid', TType::I64, 1);
            $xfer += $output->writeI64($this->lockid);
            $xfer += $output->writeFieldEnd();
        }
        if ($this->dbname !== null) {
            $xfer += $output->writeFieldBegin('dbname', TType::STRING, 2);
            $xfer += $output->writeString($this->dbname);
            $xfer += $output->writeFieldEnd();
        }
        if ($this->tablename !== null) {
            $xfer += $output->writeFieldBegin('tablename', TType::STRING, 3);
            $xfer += $output->writeString($this->tablename);
            $xfer += $output->writeFieldEnd();
        }
        if ($this->partname !== null) {
            $xfer += $output->writeFieldBegin('partname', TType::STRING, 4);
            $xfer += $output->writeString($this->partname);
            $xfer += $output->writeFieldEnd();
        }
        if ($this->state !== null) {
            $xfer += $output->writeFieldBegin('state', TType::I32, 5);
            $xfer += $output->writeI32($this->state);
            $xfer += $output->writeFieldEnd();
        }
        if ($this->type !== null) {
            $xfer += $output->writeFieldBegin('type', TType::I32, 6);
            $xfer += $output->writeI32($this->type);
            $xfer += $output->writeFieldEnd();
        }
        if ($this->txnid !== null) {
            $xfer += $output->writeFieldBegin('txnid', TType::I64, 7);
            $xfer += $output->writeI64($this->txnid);
            $xfer += $output->writeFieldEnd();
        }
        if ($this->lastheartbeat !== null) {
            $xfer += $output->writeFieldBegin('lastheartbeat', TType::I64, 8);
            $xfer += $output->writeI64($this->lastheartbeat);
            $xfer += $output->writeFieldEnd();
        }
        if ($this->acquiredat !== null) {
            $xfer += $output->writeFieldBegin('acquiredat', TType::I64, 9);
            $xfer += $output->writeI64($this->acquiredat);
            $xfer += $output->writeFieldEnd();
        }
        if ($this->user !== null) {
            $xfer += $output->writeFieldBegin('user', TType::STRING, 10);
            $xfer += $output->writeString($this->user);
            $xfer += $output->writeFieldEnd();
        }
        if ($this->hostname !== null) {
            $xfer += $output->writeFieldBegin('hostname', TType::STRING, 11);
            $xfer += $output->writeString($this->hostname);
            $xfer += $output->writeFieldEnd();
        }
        if ($this->heartbeatCount !== null) {
            $xfer += $output->writeFieldBegin('heartbeatCount', TType::I32, 12);
            $xfer += $output->writeI32($this->heartbeatCount);
            $xfer += $output->writeFieldEnd();
        }
        if ($this->agentInfo !== null) {
            $xfer += $output->writeFieldBegin('agentInfo', TType::STRING, 13);
            $xfer += $output->writeString($this->agentInfo);
            $xfer += $output->writeFieldEnd();
        }
        if ($this->blockedByExtId !== null) {
            $xfer += $output->writeFieldBegin('blockedByExtId', TType::I64, 14);
            $xfer += $output->writeI64($this->blockedByExtId);
            $xfer += $output->writeFieldEnd();
        }
        if ($this->blockedByIntId !== null) {
            $xfer += $output->writeFieldBegin('blockedByIntId', TType::I64, 15);
            $xfer += $output->writeI64($this->blockedByIntId);
            $xfer += $output->writeFieldEnd();
        }
        if ($this->lockIdInternal !== null) {
            $xfer += $output->writeFieldBegin('lockIdInternal', TType::I64, 16);
            $xfer += $output->writeI64($this->lockIdInternal);
            $xfer += $output->writeFieldEnd();
        }
        $xfer += $output->writeFieldStop();
        $xfer += $output->writeStructEnd();
        return $xfer;
    }
}
