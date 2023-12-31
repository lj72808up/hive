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

class ShowCompactResponseElement
{
    static public $isValidate = false;

    static public $_TSPEC = array(
        1 => array(
            'var' => 'dbname',
            'isRequired' => true,
            'type' => TType::STRING,
        ),
        2 => array(
            'var' => 'tablename',
            'isRequired' => true,
            'type' => TType::STRING,
        ),
        3 => array(
            'var' => 'partitionname',
            'isRequired' => false,
            'type' => TType::STRING,
        ),
        4 => array(
            'var' => 'type',
            'isRequired' => true,
            'type' => TType::I32,
            'class' => '\metastore\CompactionType',
        ),
        5 => array(
            'var' => 'state',
            'isRequired' => true,
            'type' => TType::STRING,
        ),
        6 => array(
            'var' => 'workerid',
            'isRequired' => false,
            'type' => TType::STRING,
        ),
        7 => array(
            'var' => 'start',
            'isRequired' => false,
            'type' => TType::I64,
        ),
        8 => array(
            'var' => 'runAs',
            'isRequired' => false,
            'type' => TType::STRING,
        ),
        9 => array(
            'var' => 'hightestTxnId',
            'isRequired' => false,
            'type' => TType::I64,
        ),
        10 => array(
            'var' => 'metaInfo',
            'isRequired' => false,
            'type' => TType::STRING,
        ),
        11 => array(
            'var' => 'endTime',
            'isRequired' => false,
            'type' => TType::I64,
        ),
        12 => array(
            'var' => 'hadoopJobId',
            'isRequired' => false,
            'type' => TType::STRING,
        ),
        13 => array(
            'var' => 'id',
            'isRequired' => false,
            'type' => TType::I64,
        ),
    );

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
    public $partitionname = null;
    /**
     * @var int
     */
    public $type = null;
    /**
     * @var string
     */
    public $state = null;
    /**
     * @var string
     */
    public $workerid = null;
    /**
     * @var int
     */
    public $start = null;
    /**
     * @var string
     */
    public $runAs = null;
    /**
     * @var int
     */
    public $hightestTxnId = null;
    /**
     * @var string
     */
    public $metaInfo = null;
    /**
     * @var int
     */
    public $endTime = null;
    /**
     * @var string
     */
    public $hadoopJobId = "None";
    /**
     * @var int
     */
    public $id = null;

    public function __construct($vals = null)
    {
        if (is_array($vals)) {
            if (isset($vals['dbname'])) {
                $this->dbname = $vals['dbname'];
            }
            if (isset($vals['tablename'])) {
                $this->tablename = $vals['tablename'];
            }
            if (isset($vals['partitionname'])) {
                $this->partitionname = $vals['partitionname'];
            }
            if (isset($vals['type'])) {
                $this->type = $vals['type'];
            }
            if (isset($vals['state'])) {
                $this->state = $vals['state'];
            }
            if (isset($vals['workerid'])) {
                $this->workerid = $vals['workerid'];
            }
            if (isset($vals['start'])) {
                $this->start = $vals['start'];
            }
            if (isset($vals['runAs'])) {
                $this->runAs = $vals['runAs'];
            }
            if (isset($vals['hightestTxnId'])) {
                $this->hightestTxnId = $vals['hightestTxnId'];
            }
            if (isset($vals['metaInfo'])) {
                $this->metaInfo = $vals['metaInfo'];
            }
            if (isset($vals['endTime'])) {
                $this->endTime = $vals['endTime'];
            }
            if (isset($vals['hadoopJobId'])) {
                $this->hadoopJobId = $vals['hadoopJobId'];
            }
            if (isset($vals['id'])) {
                $this->id = $vals['id'];
            }
        }
    }

    public function getName()
    {
        return 'ShowCompactResponseElement';
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
                    if ($ftype == TType::STRING) {
                        $xfer += $input->readString($this->dbname);
                    } else {
                        $xfer += $input->skip($ftype);
                    }
                    break;
                case 2:
                    if ($ftype == TType::STRING) {
                        $xfer += $input->readString($this->tablename);
                    } else {
                        $xfer += $input->skip($ftype);
                    }
                    break;
                case 3:
                    if ($ftype == TType::STRING) {
                        $xfer += $input->readString($this->partitionname);
                    } else {
                        $xfer += $input->skip($ftype);
                    }
                    break;
                case 4:
                    if ($ftype == TType::I32) {
                        $xfer += $input->readI32($this->type);
                    } else {
                        $xfer += $input->skip($ftype);
                    }
                    break;
                case 5:
                    if ($ftype == TType::STRING) {
                        $xfer += $input->readString($this->state);
                    } else {
                        $xfer += $input->skip($ftype);
                    }
                    break;
                case 6:
                    if ($ftype == TType::STRING) {
                        $xfer += $input->readString($this->workerid);
                    } else {
                        $xfer += $input->skip($ftype);
                    }
                    break;
                case 7:
                    if ($ftype == TType::I64) {
                        $xfer += $input->readI64($this->start);
                    } else {
                        $xfer += $input->skip($ftype);
                    }
                    break;
                case 8:
                    if ($ftype == TType::STRING) {
                        $xfer += $input->readString($this->runAs);
                    } else {
                        $xfer += $input->skip($ftype);
                    }
                    break;
                case 9:
                    if ($ftype == TType::I64) {
                        $xfer += $input->readI64($this->hightestTxnId);
                    } else {
                        $xfer += $input->skip($ftype);
                    }
                    break;
                case 10:
                    if ($ftype == TType::STRING) {
                        $xfer += $input->readString($this->metaInfo);
                    } else {
                        $xfer += $input->skip($ftype);
                    }
                    break;
                case 11:
                    if ($ftype == TType::I64) {
                        $xfer += $input->readI64($this->endTime);
                    } else {
                        $xfer += $input->skip($ftype);
                    }
                    break;
                case 12:
                    if ($ftype == TType::STRING) {
                        $xfer += $input->readString($this->hadoopJobId);
                    } else {
                        $xfer += $input->skip($ftype);
                    }
                    break;
                case 13:
                    if ($ftype == TType::I64) {
                        $xfer += $input->readI64($this->id);
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
        $xfer += $output->writeStructBegin('ShowCompactResponseElement');
        if ($this->dbname !== null) {
            $xfer += $output->writeFieldBegin('dbname', TType::STRING, 1);
            $xfer += $output->writeString($this->dbname);
            $xfer += $output->writeFieldEnd();
        }
        if ($this->tablename !== null) {
            $xfer += $output->writeFieldBegin('tablename', TType::STRING, 2);
            $xfer += $output->writeString($this->tablename);
            $xfer += $output->writeFieldEnd();
        }
        if ($this->partitionname !== null) {
            $xfer += $output->writeFieldBegin('partitionname', TType::STRING, 3);
            $xfer += $output->writeString($this->partitionname);
            $xfer += $output->writeFieldEnd();
        }
        if ($this->type !== null) {
            $xfer += $output->writeFieldBegin('type', TType::I32, 4);
            $xfer += $output->writeI32($this->type);
            $xfer += $output->writeFieldEnd();
        }
        if ($this->state !== null) {
            $xfer += $output->writeFieldBegin('state', TType::STRING, 5);
            $xfer += $output->writeString($this->state);
            $xfer += $output->writeFieldEnd();
        }
        if ($this->workerid !== null) {
            $xfer += $output->writeFieldBegin('workerid', TType::STRING, 6);
            $xfer += $output->writeString($this->workerid);
            $xfer += $output->writeFieldEnd();
        }
        if ($this->start !== null) {
            $xfer += $output->writeFieldBegin('start', TType::I64, 7);
            $xfer += $output->writeI64($this->start);
            $xfer += $output->writeFieldEnd();
        }
        if ($this->runAs !== null) {
            $xfer += $output->writeFieldBegin('runAs', TType::STRING, 8);
            $xfer += $output->writeString($this->runAs);
            $xfer += $output->writeFieldEnd();
        }
        if ($this->hightestTxnId !== null) {
            $xfer += $output->writeFieldBegin('hightestTxnId', TType::I64, 9);
            $xfer += $output->writeI64($this->hightestTxnId);
            $xfer += $output->writeFieldEnd();
        }
        if ($this->metaInfo !== null) {
            $xfer += $output->writeFieldBegin('metaInfo', TType::STRING, 10);
            $xfer += $output->writeString($this->metaInfo);
            $xfer += $output->writeFieldEnd();
        }
        if ($this->endTime !== null) {
            $xfer += $output->writeFieldBegin('endTime', TType::I64, 11);
            $xfer += $output->writeI64($this->endTime);
            $xfer += $output->writeFieldEnd();
        }
        if ($this->hadoopJobId !== null) {
            $xfer += $output->writeFieldBegin('hadoopJobId', TType::STRING, 12);
            $xfer += $output->writeString($this->hadoopJobId);
            $xfer += $output->writeFieldEnd();
        }
        if ($this->id !== null) {
            $xfer += $output->writeFieldBegin('id', TType::I64, 13);
            $xfer += $output->writeI64($this->id);
            $xfer += $output->writeFieldEnd();
        }
        $xfer += $output->writeFieldStop();
        $xfer += $output->writeStructEnd();
        return $xfer;
    }
}
