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

class GetFileMetadataResult
{
    static public $isValidate = false;

    static public $_TSPEC = array(
        1 => array(
            'var' => 'metadata',
            'isRequired' => true,
            'type' => TType::MAP,
            'ktype' => TType::I64,
            'vtype' => TType::STRING,
            'key' => array(
                'type' => TType::I64,
            ),
            'val' => array(
                'type' => TType::STRING,
                ),
        ),
        2 => array(
            'var' => 'isSupported',
            'isRequired' => true,
            'type' => TType::BOOL,
        ),
    );

    /**
     * @var array
     */
    public $metadata = null;
    /**
     * @var bool
     */
    public $isSupported = null;

    public function __construct($vals = null)
    {
        if (is_array($vals)) {
            if (isset($vals['metadata'])) {
                $this->metadata = $vals['metadata'];
            }
            if (isset($vals['isSupported'])) {
                $this->isSupported = $vals['isSupported'];
            }
        }
    }

    public function getName()
    {
        return 'GetFileMetadataResult';
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
                    if ($ftype == TType::MAP) {
                        $this->metadata = array();
                        $_size560 = 0;
                        $_ktype561 = 0;
                        $_vtype562 = 0;
                        $xfer += $input->readMapBegin($_ktype561, $_vtype562, $_size560);
                        for ($_i564 = 0; $_i564 < $_size560; ++$_i564) {
                            $key565 = 0;
                            $val566 = '';
                            $xfer += $input->readI64($key565);
                            $xfer += $input->readString($val566);
                            $this->metadata[$key565] = $val566;
                        }
                        $xfer += $input->readMapEnd();
                    } else {
                        $xfer += $input->skip($ftype);
                    }
                    break;
                case 2:
                    if ($ftype == TType::BOOL) {
                        $xfer += $input->readBool($this->isSupported);
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
        $xfer += $output->writeStructBegin('GetFileMetadataResult');
        if ($this->metadata !== null) {
            if (!is_array($this->metadata)) {
                throw new TProtocolException('Bad type in structure.', TProtocolException::INVALID_DATA);
            }
            $xfer += $output->writeFieldBegin('metadata', TType::MAP, 1);
            $output->writeMapBegin(TType::I64, TType::STRING, count($this->metadata));
            foreach ($this->metadata as $kiter567 => $viter568) {
                $xfer += $output->writeI64($kiter567);
                $xfer += $output->writeString($viter568);
            }
            $output->writeMapEnd();
            $xfer += $output->writeFieldEnd();
        }
        if ($this->isSupported !== null) {
            $xfer += $output->writeFieldBegin('isSupported', TType::BOOL, 2);
            $xfer += $output->writeBool($this->isSupported);
            $xfer += $output->writeFieldEnd();
        }
        $xfer += $output->writeFieldStop();
        $xfer += $output->writeStructEnd();
        return $xfer;
    }
}
