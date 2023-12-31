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

class GetOpenTxnsResponse
{
    static public $isValidate = false;

    static public $_TSPEC = array(
        1 => array(
            'var' => 'txn_high_water_mark',
            'isRequired' => true,
            'type' => TType::I64,
        ),
        2 => array(
            'var' => 'open_txns',
            'isRequired' => true,
            'type' => TType::SET,
            'etype' => TType::I64,
            'elem' => array(
                'type' => TType::I64,
                ),
        ),
        3 => array(
            'var' => 'min_open_txn',
            'isRequired' => false,
            'type' => TType::I64,
        ),
    );

    /**
     * @var int
     */
    public $txn_high_water_mark = null;
    /**
     * @var int[]
     */
    public $open_txns = null;
    /**
     * @var int
     */
    public $min_open_txn = null;

    public function __construct($vals = null)
    {
        if (is_array($vals)) {
            if (isset($vals['txn_high_water_mark'])) {
                $this->txn_high_water_mark = $vals['txn_high_water_mark'];
            }
            if (isset($vals['open_txns'])) {
                $this->open_txns = $vals['open_txns'];
            }
            if (isset($vals['min_open_txn'])) {
                $this->min_open_txn = $vals['min_open_txn'];
            }
        }
    }

    public function getName()
    {
        return 'GetOpenTxnsResponse';
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
                        $xfer += $input->readI64($this->txn_high_water_mark);
                    } else {
                        $xfer += $input->skip($ftype);
                    }
                    break;
                case 2:
                    if ($ftype == TType::SET) {
                        $this->open_txns = array();
                        $_size441 = 0;
                        $_etype444 = 0;
                        $xfer += $input->readSetBegin($_etype444, $_size441);
                        for ($_i445 = 0; $_i445 < $_size441; ++$_i445) {
                            $elem446 = null;
                            $xfer += $input->readI64($elem446);
                            $this->open_txns[$elem446] = true;
                        }
                        $xfer += $input->readSetEnd();
                    } else {
                        $xfer += $input->skip($ftype);
                    }
                    break;
                case 3:
                    if ($ftype == TType::I64) {
                        $xfer += $input->readI64($this->min_open_txn);
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
        $xfer += $output->writeStructBegin('GetOpenTxnsResponse');
        if ($this->txn_high_water_mark !== null) {
            $xfer += $output->writeFieldBegin('txn_high_water_mark', TType::I64, 1);
            $xfer += $output->writeI64($this->txn_high_water_mark);
            $xfer += $output->writeFieldEnd();
        }
        if ($this->open_txns !== null) {
            if (!is_array($this->open_txns)) {
                throw new TProtocolException('Bad type in structure.', TProtocolException::INVALID_DATA);
            }
            $xfer += $output->writeFieldBegin('open_txns', TType::SET, 2);
            $output->writeSetBegin(TType::I64, count($this->open_txns));
            foreach ($this->open_txns as $iter447 => $iter448) {
                $xfer += $output->writeI64($iter447);
            }
            $output->writeSetEnd();
            $xfer += $output->writeFieldEnd();
        }
        if ($this->min_open_txn !== null) {
            $xfer += $output->writeFieldBegin('min_open_txn', TType::I64, 3);
            $xfer += $output->writeI64($this->min_open_txn);
            $xfer += $output->writeFieldEnd();
        }
        $xfer += $output->writeFieldStop();
        $xfer += $output->writeStructEnd();
        return $xfer;
    }
}
