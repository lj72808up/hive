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

class SetPartitionsStatsRequest
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
                'class' => '\metastore\ColumnStatistics',
                ),
        ),
        2 => array(
            'var' => 'needMerge',
            'isRequired' => false,
            'type' => TType::BOOL,
        ),
    );

    /**
     * @var \metastore\ColumnStatistics[]
     */
    public $colStats = null;
    /**
     * @var bool
     */
    public $needMerge = null;

    public function __construct($vals = null)
    {
        if (is_array($vals)) {
            if (isset($vals['colStats'])) {
                $this->colStats = $vals['colStats'];
            }
            if (isset($vals['needMerge'])) {
                $this->needMerge = $vals['needMerge'];
            }
        }
    }

    public function getName()
    {
        return 'SetPartitionsStatsRequest';
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
                        $_size253 = 0;
                        $_etype256 = 0;
                        $xfer += $input->readListBegin($_etype256, $_size253);
                        for ($_i257 = 0; $_i257 < $_size253; ++$_i257) {
                            $elem258 = null;
                            $elem258 = new \metastore\ColumnStatistics();
                            $xfer += $elem258->read($input);
                            $this->colStats []= $elem258;
                        }
                        $xfer += $input->readListEnd();
                    } else {
                        $xfer += $input->skip($ftype);
                    }
                    break;
                case 2:
                    if ($ftype == TType::BOOL) {
                        $xfer += $input->readBool($this->needMerge);
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
        $xfer += $output->writeStructBegin('SetPartitionsStatsRequest');
        if ($this->colStats !== null) {
            if (!is_array($this->colStats)) {
                throw new TProtocolException('Bad type in structure.', TProtocolException::INVALID_DATA);
            }
            $xfer += $output->writeFieldBegin('colStats', TType::LST, 1);
            $output->writeListBegin(TType::STRUCT, count($this->colStats));
            foreach ($this->colStats as $iter259) {
                $xfer += $iter259->write($output);
            }
            $output->writeListEnd();
            $xfer += $output->writeFieldEnd();
        }
        if ($this->needMerge !== null) {
            $xfer += $output->writeFieldBegin('needMerge', TType::BOOL, 2);
            $xfer += $output->writeBool($this->needMerge);
            $xfer += $output->writeFieldEnd();
        }
        $xfer += $output->writeFieldStop();
        $xfer += $output->writeStructEnd();
        return $xfer;
    }
}
