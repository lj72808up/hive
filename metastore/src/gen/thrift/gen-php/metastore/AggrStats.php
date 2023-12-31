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

class AggrStats
{
    static public $isValidate = false;

    static public $_TSPEC = array(
        1 => array(
            'var' => 'colStats',
            'isRequired' => true,
            'type' => TType::LST,
            'etype' => TType::STRUCT,
            'elem' => array(
                'type' => TType::STRUCT,
                'class' => '\metastore\ColumnStatisticsObj',
                ),
        ),
        2 => array(
            'var' => 'partsFound',
            'isRequired' => true,
            'type' => TType::I64,
        ),
    );

    /**
     * @var \metastore\ColumnStatisticsObj[]
     */
    public $colStats = null;
    /**
     * @var int
     */
    public $partsFound = null;

    public function __construct($vals = null)
    {
        if (is_array($vals)) {
            if (isset($vals['colStats'])) {
                $this->colStats = $vals['colStats'];
            }
            if (isset($vals['partsFound'])) {
                $this->partsFound = $vals['partsFound'];
            }
        }
    }

    public function getName()
    {
        return 'AggrStats';
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
                        $this->colStats = array();
                        $_size246 = 0;
                        $_etype249 = 0;
                        $xfer += $input->readListBegin($_etype249, $_size246);
                        for ($_i250 = 0; $_i250 < $_size246; ++$_i250) {
                            $elem251 = null;
                            $elem251 = new \metastore\ColumnStatisticsObj();
                            $xfer += $elem251->read($input);
                            $this->colStats []= $elem251;
                        }
                        $xfer += $input->readListEnd();
                    } else {
                        $xfer += $input->skip($ftype);
                    }
                    break;
                case 2:
                    if ($ftype == TType::I64) {
                        $xfer += $input->readI64($this->partsFound);
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
        $xfer += $output->writeStructBegin('AggrStats');
        if ($this->colStats !== null) {
            if (!is_array($this->colStats)) {
                throw new TProtocolException('Bad type in structure.', TProtocolException::INVALID_DATA);
            }
            $xfer += $output->writeFieldBegin('colStats', TType::LST, 1);
            $output->writeListBegin(TType::STRUCT, count($this->colStats));
            foreach ($this->colStats as $iter252) {
                $xfer += $iter252->write($output);
            }
            $output->writeListEnd();
            $xfer += $output->writeFieldEnd();
        }
        if ($this->partsFound !== null) {
            $xfer += $output->writeFieldBegin('partsFound', TType::I64, 2);
            $xfer += $output->writeI64($this->partsFound);
            $xfer += $output->writeFieldEnd();
        }
        $xfer += $output->writeFieldStop();
        $xfer += $output->writeStructEnd();
        return $xfer;
    }
}
