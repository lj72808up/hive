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

class ThriftHiveMetastore_add_partition_with_environment_context_args
{
    static public $isValidate = false;

    static public $_TSPEC = array(
        1 => array(
            'var' => 'new_part',
            'isRequired' => false,
            'type' => TType::STRUCT,
            'class' => '\metastore\Partition',
        ),
        2 => array(
            'var' => 'environment_context',
            'isRequired' => false,
            'type' => TType::STRUCT,
            'class' => '\metastore\EnvironmentContext',
        ),
    );

    /**
     * @var \metastore\Partition
     */
    public $new_part = null;
    /**
     * @var \metastore\EnvironmentContext
     */
    public $environment_context = null;

    public function __construct($vals = null)
    {
        if (is_array($vals)) {
            if (isset($vals['new_part'])) {
                $this->new_part = $vals['new_part'];
            }
            if (isset($vals['environment_context'])) {
                $this->environment_context = $vals['environment_context'];
            }
        }
    }

    public function getName()
    {
        return 'ThriftHiveMetastore_add_partition_with_environment_context_args';
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
                    if ($ftype == TType::STRUCT) {
                        $this->new_part = new \metastore\Partition();
                        $xfer += $this->new_part->read($input);
                    } else {
                        $xfer += $input->skip($ftype);
                    }
                    break;
                case 2:
                    if ($ftype == TType::STRUCT) {
                        $this->environment_context = new \metastore\EnvironmentContext();
                        $xfer += $this->environment_context->read($input);
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
        $xfer += $output->writeStructBegin('ThriftHiveMetastore_add_partition_with_environment_context_args');
        if ($this->new_part !== null) {
            if (!is_object($this->new_part)) {
                throw new TProtocolException('Bad type in structure.', TProtocolException::INVALID_DATA);
            }
            $xfer += $output->writeFieldBegin('new_part', TType::STRUCT, 1);
            $xfer += $this->new_part->write($output);
            $xfer += $output->writeFieldEnd();
        }
        if ($this->environment_context !== null) {
            if (!is_object($this->environment_context)) {
                throw new TProtocolException('Bad type in structure.', TProtocolException::INVALID_DATA);
            }
            $xfer += $output->writeFieldBegin('environment_context', TType::STRUCT, 2);
            $xfer += $this->environment_context->write($output);
            $xfer += $output->writeFieldEnd();
        }
        $xfer += $output->writeFieldStop();
        $xfer += $output->writeStructEnd();
        return $xfer;
    }
}
