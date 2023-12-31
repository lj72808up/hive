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

class TProgressUpdateResp
{
    static public $isValidate = false;

    static public $_TSPEC = array(
        1 => array(
            'var' => 'headerNames',
            'isRequired' => true,
            'type' => TType::LST,
            'etype' => TType::STRING,
            'elem' => array(
                'type' => TType::STRING,
                ),
        ),
        2 => array(
            'var' => 'rows',
            'isRequired' => true,
            'type' => TType::LST,
            'etype' => TType::LST,
            'elem' => array(
                'type' => TType::LST,
                'etype' => TType::STRING,
                'elem' => array(
                    'type' => TType::STRING,
                    ),
                ),
        ),
        3 => array(
            'var' => 'progressedPercentage',
            'isRequired' => true,
            'type' => TType::DOUBLE,
        ),
        4 => array(
            'var' => 'status',
            'isRequired' => true,
            'type' => TType::I32,
            'class' => '\TJobExecutionStatus',
        ),
        5 => array(
            'var' => 'footerSummary',
            'isRequired' => true,
            'type' => TType::STRING,
        ),
        6 => array(
            'var' => 'startTime',
            'isRequired' => true,
            'type' => TType::I64,
        ),
    );

    /**
     * @var string[]
     */
    public $headerNames = null;
    /**
     * @var (string[])[]
     */
    public $rows = null;
    /**
     * @var double
     */
    public $progressedPercentage = null;
    /**
     * @var int
     */
    public $status = null;
    /**
     * @var string
     */
    public $footerSummary = null;
    /**
     * @var int
     */
    public $startTime = null;

    public function __construct($vals = null)
    {
        if (is_array($vals)) {
            if (isset($vals['headerNames'])) {
                $this->headerNames = $vals['headerNames'];
            }
            if (isset($vals['rows'])) {
                $this->rows = $vals['rows'];
            }
            if (isset($vals['progressedPercentage'])) {
                $this->progressedPercentage = $vals['progressedPercentage'];
            }
            if (isset($vals['status'])) {
                $this->status = $vals['status'];
            }
            if (isset($vals['footerSummary'])) {
                $this->footerSummary = $vals['footerSummary'];
            }
            if (isset($vals['startTime'])) {
                $this->startTime = $vals['startTime'];
            }
        }
    }

    public function getName()
    {
        return 'TProgressUpdateResp';
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
                    if ($ftype == TType::LST) {
                        $this->headerNames = array();
                        $_size159 = 0;
                        $_etype162 = 0;
                        $xfer += $input->readListBegin($_etype162, $_size159);
                        for ($_i163 = 0; $_i163 < $_size159; ++$_i163) {
                            $elem164 = null;
                            $xfer += $input->readString($elem164);
                            $this->headerNames []= $elem164;
                        }
                        $xfer += $input->readListEnd();
                    } else {
                        $xfer += $input->skip($ftype);
                    }
                    break;
                case 2:
                    if ($ftype == TType::LST) {
                        $this->rows = array();
                        $_size165 = 0;
                        $_etype168 = 0;
                        $xfer += $input->readListBegin($_etype168, $_size165);
                        for ($_i169 = 0; $_i169 < $_size165; ++$_i169) {
                            $elem170 = null;
                            $elem170 = array();
                            $_size171 = 0;
                            $_etype174 = 0;
                            $xfer += $input->readListBegin($_etype174, $_size171);
                            for ($_i175 = 0; $_i175 < $_size171; ++$_i175) {
                                $elem176 = null;
                                $xfer += $input->readString($elem176);
                                $elem170 []= $elem176;
                            }
                            $xfer += $input->readListEnd();
                            $this->rows []= $elem170;
                        }
                        $xfer += $input->readListEnd();
                    } else {
                        $xfer += $input->skip($ftype);
                    }
                    break;
                case 3:
                    if ($ftype == TType::DOUBLE) {
                        $xfer += $input->readDouble($this->progressedPercentage);
                    } else {
                        $xfer += $input->skip($ftype);
                    }
                    break;
                case 4:
                    if ($ftype == TType::I32) {
                        $xfer += $input->readI32($this->status);
                    } else {
                        $xfer += $input->skip($ftype);
                    }
                    break;
                case 5:
                    if ($ftype == TType::STRING) {
                        $xfer += $input->readString($this->footerSummary);
                    } else {
                        $xfer += $input->skip($ftype);
                    }
                    break;
                case 6:
                    if ($ftype == TType::I64) {
                        $xfer += $input->readI64($this->startTime);
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
        $xfer += $output->writeStructBegin('TProgressUpdateResp');
        if ($this->headerNames !== null) {
            if (!is_array($this->headerNames)) {
                throw new TProtocolException('Bad type in structure.', TProtocolException::INVALID_DATA);
            }
            $xfer += $output->writeFieldBegin('headerNames', TType::LST, 1);
            $output->writeListBegin(TType::STRING, count($this->headerNames));
            foreach ($this->headerNames as $iter177) {
                $xfer += $output->writeString($iter177);
            }
            $output->writeListEnd();
            $xfer += $output->writeFieldEnd();
        }
        if ($this->rows !== null) {
            if (!is_array($this->rows)) {
                throw new TProtocolException('Bad type in structure.', TProtocolException::INVALID_DATA);
            }
            $xfer += $output->writeFieldBegin('rows', TType::LST, 2);
            $output->writeListBegin(TType::LST, count($this->rows));
            foreach ($this->rows as $iter178) {
                $output->writeListBegin(TType::STRING, count($iter178));
                foreach ($iter178 as $iter179) {
                    $xfer += $output->writeString($iter179);
                }
                $output->writeListEnd();
            }
            $output->writeListEnd();
            $xfer += $output->writeFieldEnd();
        }
        if ($this->progressedPercentage !== null) {
            $xfer += $output->writeFieldBegin('progressedPercentage', TType::DOUBLE, 3);
            $xfer += $output->writeDouble($this->progressedPercentage);
            $xfer += $output->writeFieldEnd();
        }
        if ($this->status !== null) {
            $xfer += $output->writeFieldBegin('status', TType::I32, 4);
            $xfer += $output->writeI32($this->status);
            $xfer += $output->writeFieldEnd();
        }
        if ($this->footerSummary !== null) {
            $xfer += $output->writeFieldBegin('footerSummary', TType::STRING, 5);
            $xfer += $output->writeString($this->footerSummary);
            $xfer += $output->writeFieldEnd();
        }
        if ($this->startTime !== null) {
            $xfer += $output->writeFieldBegin('startTime', TType::I64, 6);
            $xfer += $output->writeI64($this->startTime);
            $xfer += $output->writeFieldEnd();
        }
        $xfer += $output->writeFieldStop();
        $xfer += $output->writeStructEnd();
        return $xfer;
    }
}
