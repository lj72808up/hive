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

class TRow
{
    static public $isValidate = false;

    static public $_TSPEC = array(
        1 => array(
            'var' => 'colVals',
            'isRequired' => true,
            'type' => TType::LST,
            'etype' => TType::STRUCT,
            'elem' => array(
                'type' => TType::STRUCT,
                'class' => '\TColumnValue',
                ),
        ),
    );

    /**
     * @var \TColumnValue[]
     */
    public $colVals = null;

    public function __construct($vals = null)
    {
        if (is_array($vals)) {
            if (isset($vals['colVals'])) {
                $this->colVals = $vals['colVals'];
            }
        }
    }

    public function getName()
    {
        return 'TRow';
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
                        $this->colVals = array();
                        $_size41 = 0;
                        $_etype44 = 0;
                        $xfer += $input->readListBegin($_etype44, $_size41);
                        for ($_i45 = 0; $_i45 < $_size41; ++$_i45) {
                            $elem46 = null;
                            $elem46 = new \TColumnValue();
                            $xfer += $elem46->read($input);
                            $this->colVals []= $elem46;
                        }
                        $xfer += $input->readListEnd();
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
        $xfer += $output->writeStructBegin('TRow');
        if ($this->colVals !== null) {
            if (!is_array($this->colVals)) {
                throw new TProtocolException('Bad type in structure.', TProtocolException::INVALID_DATA);
            }
            $xfer += $output->writeFieldBegin('colVals', TType::LST, 1);
            $output->writeListBegin(TType::STRUCT, count($this->colVals));
            foreach ($this->colVals as $iter47) {
                $xfer += $iter47->write($output);
            }
            $output->writeListEnd();
            $xfer += $output->writeFieldEnd();
        }
        $xfer += $output->writeFieldStop();
        $xfer += $output->writeStructEnd();
        return $xfer;
    }
}
