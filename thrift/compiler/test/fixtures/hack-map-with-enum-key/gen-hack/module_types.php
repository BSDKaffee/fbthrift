<?hh // strict
/**
 * Autogenerated by Thrift
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */

/**
 * Original thrift enum:-
 * FooEnum
 */
enum FooEnum: int {
  BAR = 0;
  BAZ = 1;
}
type FooEnumType = FooEnum;

/**
 * Original thrift struct:-
 * BarStruct
 */
class BarStruct implements \IThriftStruct, \IThriftShapishStruct {
  use \ThriftSerializationTrait;

  public static darray<int, darray<string, mixed>> $_TSPEC = darray[
    1 => darray[
      'var' => 'e',
      'type' => \TType::MAP,
      'ktype' => \TType::I32,
      'vtype' => \TType::I32,
      'key' => darray[
        'type' => \TType::I32,
        'enum' => 'FooEnum',
      ],
      'val' => darray[
        'type' => \TType::I32,
        'enum' => 'FooEnum',
        ],
        'format' => 'collection',
      'qualifier' => \TFieldQualifier::T_OPT_IN_REQ_OUT,
      ],
    2 => darray[
      'var' => 's',
      'type' => \TType::SET,
      'etype' => \TType::I32,
      'elem' => darray[
        'type' => \TType::I32,
        'enum' => 'FooEnum',
        ],
        'format' => 'collection',
      'qualifier' => \TFieldQualifier::T_OPT_IN_REQ_OUT,
      ],
    ];
  public static Map<string, int> $_TFIELDMAP = Map {
    'e' => 1,
    's' => 2,
  };
  const type TShape = shape(
    'e' => darray<FooEnum, FooEnum>,
    's' => darray<FooEnum, bool>,
    ...
  );
  const int STRUCTURAL_ID = 2986314503120154076;
  /**
   * Original thrift field:-
   * 1: map<enum module.FooEnum, enum module.FooEnum> e
   */
  public Map<FooEnum, FooEnum> $e;
  /**
   * Original thrift field:-
   * 2: set<enum module.FooEnum> s
   */
  public Set<FooEnum> $s;

  public function __construct(?Map<FooEnum, FooEnum> $e = null, ?Set<FooEnum> $s = null  ) {
    if ($e === null) {
      $this->e = Map {};
    } else {
      $this->e = $e;
    }
    if ($s === null) {
      $this->s = Set {};
    } else {
      $this->s = $s;
    }
  }

  public function getName(): string {
    return 'BarStruct';
  }

  public static function __fromShape(self::TShape $shape): this {
    $me = /* HH_IGNORE_ERROR[4060] */ new static();
    $me->e = (new Map($shape['e']));
    $me->s = new Set(Keyset\keys($shape['s']));
    return $me;
  }

  public function __toShape(): self::TShape {
    return shape(
      'e' => ThriftUtil::toDArray($this->e),
      's' => ThriftUtil::toDArray(Dict\fill_keys($this->s->toValuesArray(), true)),
    );
  }
}

