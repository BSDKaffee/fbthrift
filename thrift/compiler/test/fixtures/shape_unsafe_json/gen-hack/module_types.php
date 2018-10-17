<?hh // strict
/**
 * Autogenerated by Thrift
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */

/**
 * Original thrift struct:-
 * A
 */
class A implements \IThriftStruct, \IThriftShapishStruct {
  use \ThriftSerializationTrait;

  public static dict<int, dict<string, mixed>> $_TSPEC = dict[
    1 => dict[
      'var' => 'a',
      'type' => \TType::STRING,
      'qualifier' => \TFieldQualifier::T_OPT_IN_REQ_OUT,
      ],
    ];
  public static Map<string, int> $_TFIELDMAP = Map {
    'a' => 1,
  };
  const type TShape = shape(
    'a' => string,
    ...
  );
  const int STRUCTURAL_ID = 7939807933046472325;
  /**
   * Original thrift field:-
   * 1: string a
   */
  public string $a;

  public function __construct(?string $a = null  ) {
    if ($a === null) {
      $this->a = '';
    } else {
      $this->a = $a;
    }
  }

  public function getName(): string {
    return 'A';
  }

  public static function __fromShape(self::TShape $shape): this {
    $me = /* HH_IGNORE_ERROR[4060] */ new static();
    $me->a = $shape['a'];
    return $me;
  }

  public function __toShape(): self::TShape {
    return shape(
      'a' => $this->a,
    );
  }
}

/**
 * Original thrift struct:-
 * B
 */
class B implements \IThriftStruct, \IThriftShapishStruct {
  use \ThriftSerializationTrait;

  public static dict<int, dict<string, mixed>> $_TSPEC = dict[
    1 => dict[
      'var' => 'just_an_A',
      'type' => \TType::STRUCT,
      'class' => 'A',
      'qualifier' => \TFieldQualifier::T_OPT_IN_REQ_OUT,
      ],
    2 => dict[
      'var' => 'set_of_i32',
      'type' => \TType::SET,
      'etype' => \TType::I32,
      'elem' => dict[
        'type' => \TType::I32,
        ],
        'format' => 'collection',
      'qualifier' => \TFieldQualifier::T_OPT_IN_REQ_OUT,
      ],
    3 => dict[
      'var' => 'list_of_i32',
      'type' => \TType::LST,
      'etype' => \TType::I32,
      'elem' => dict[
        'type' => \TType::I32,
        ],
        'format' => 'collection',
      'qualifier' => \TFieldQualifier::T_OPT_IN_REQ_OUT,
      ],
    4 => dict[
      'var' => 'list_of_string',
      'type' => \TType::LST,
      'etype' => \TType::STRING,
      'elem' => dict[
        'type' => \TType::STRING,
        ],
        'format' => 'collection',
      'qualifier' => \TFieldQualifier::T_OPT_IN_REQ_OUT,
      ],
    5 => dict[
      'var' => 'map_of_string_to_i32',
      'type' => \TType::MAP,
      'ktype' => \TType::STRING,
      'vtype' => \TType::I32,
      'key' => dict[
        'type' => \TType::STRING,
      ],
      'val' => dict[
        'type' => \TType::I32,
        ],
        'format' => 'collection',
      'qualifier' => \TFieldQualifier::T_OPT_IN_REQ_OUT,
      ],
    6 => dict[
      'var' => 'map_of_string_to_A',
      'type' => \TType::MAP,
      'ktype' => \TType::STRING,
      'vtype' => \TType::STRUCT,
      'key' => dict[
        'type' => \TType::STRING,
      ],
      'val' => dict[
        'type' => \TType::STRUCT,
        'class' => 'A',
        ],
        'format' => 'collection',
      'qualifier' => \TFieldQualifier::T_OPT_IN_REQ_OUT,
      ],
    7 => dict[
      'var' => 'map_of_string_to_list_of_i32',
      'type' => \TType::MAP,
      'ktype' => \TType::STRING,
      'vtype' => \TType::LST,
      'key' => dict[
        'type' => \TType::STRING,
      ],
      'val' => dict[
        'type' => \TType::LST,
        'etype' => \TType::I32,
        'elem' => dict[
          'type' => \TType::I32,
          ],
          'format' => 'collection',
        ],
        'format' => 'collection',
      'qualifier' => \TFieldQualifier::T_OPT_IN_REQ_OUT,
      ],
    8 => dict[
      'var' => 'map_of_string_to_list_of_A',
      'type' => \TType::MAP,
      'ktype' => \TType::STRING,
      'vtype' => \TType::LST,
      'key' => dict[
        'type' => \TType::STRING,
      ],
      'val' => dict[
        'type' => \TType::LST,
        'etype' => \TType::STRUCT,
        'elem' => dict[
          'type' => \TType::STRUCT,
          'class' => 'A',
          ],
          'format' => 'collection',
        ],
        'format' => 'collection',
      'qualifier' => \TFieldQualifier::T_OPT_IN_REQ_OUT,
      ],
    9 => dict[
      'var' => 'map_of_string_to_set_of_i32',
      'type' => \TType::MAP,
      'ktype' => \TType::STRING,
      'vtype' => \TType::SET,
      'key' => dict[
        'type' => \TType::STRING,
      ],
      'val' => dict[
        'type' => \TType::SET,
        'etype' => \TType::I32,
        'elem' => dict[
          'type' => \TType::I32,
          ],
          'format' => 'collection',
        ],
        'format' => 'collection',
      'qualifier' => \TFieldQualifier::T_OPT_IN_REQ_OUT,
      ],
    10 => dict[
      'var' => 'map_of_string_to_map_of_string_to_i32',
      'type' => \TType::MAP,
      'ktype' => \TType::STRING,
      'vtype' => \TType::MAP,
      'key' => dict[
        'type' => \TType::STRING,
      ],
      'val' => dict[
        'type' => \TType::MAP,
        'ktype' => \TType::STRING,
        'vtype' => \TType::I32,
        'key' => dict[
          'type' => \TType::STRING,
        ],
        'val' => dict[
          'type' => \TType::I32,
          ],
          'format' => 'collection',
        ],
        'format' => 'collection',
      'qualifier' => \TFieldQualifier::T_OPT_IN_REQ_OUT,
      ],
    11 => dict[
      'var' => 'map_of_string_to_map_of_string_to_A',
      'type' => \TType::MAP,
      'ktype' => \TType::STRING,
      'vtype' => \TType::MAP,
      'key' => dict[
        'type' => \TType::STRING,
      ],
      'val' => dict[
        'type' => \TType::MAP,
        'ktype' => \TType::STRING,
        'vtype' => \TType::STRUCT,
        'key' => dict[
          'type' => \TType::STRING,
        ],
        'val' => dict[
          'type' => \TType::STRUCT,
          'class' => 'A',
          ],
          'format' => 'collection',
        ],
        'format' => 'collection',
      'qualifier' => \TFieldQualifier::T_OPT_IN_REQ_OUT,
      ],
    12 => dict[
      'var' => 'list_of_set_of_i32',
      'type' => \TType::LST,
      'etype' => \TType::SET,
      'elem' => dict[
        'type' => \TType::SET,
        'etype' => \TType::I32,
        'elem' => dict[
          'type' => \TType::I32,
          ],
          'format' => 'collection',
        ],
        'format' => 'collection',
      'qualifier' => \TFieldQualifier::T_OPT_IN_REQ_OUT,
      ],
    13 => dict[
      'var' => 'list_of_map_of_string_to_list_of_A',
      'type' => \TType::LST,
      'etype' => \TType::MAP,
      'elem' => dict[
        'type' => \TType::MAP,
        'ktype' => \TType::STRING,
        'vtype' => \TType::LST,
        'key' => dict[
          'type' => \TType::STRING,
        ],
        'val' => dict[
          'type' => \TType::LST,
          'etype' => \TType::STRUCT,
          'elem' => dict[
            'type' => \TType::STRUCT,
            'class' => 'A',
            ],
            'format' => 'collection',
          ],
          'format' => 'collection',
        ],
        'format' => 'collection',
      'qualifier' => \TFieldQualifier::T_OPT_IN_REQ_OUT,
      ],
    14 => dict[
      'var' => 'list_of_map_of_string_to_A',
      'type' => \TType::LST,
      'etype' => \TType::MAP,
      'elem' => dict[
        'type' => \TType::MAP,
        'ktype' => \TType::STRING,
        'vtype' => \TType::STRUCT,
        'key' => dict[
          'type' => \TType::STRING,
        ],
        'val' => dict[
          'type' => \TType::STRUCT,
          'class' => 'A',
          ],
          'format' => 'collection',
        ],
        'format' => 'collection',
      'qualifier' => \TFieldQualifier::T_OPT_IN_REQ_OUT,
      ],
    15 => dict[
      'var' => 'list_of_self',
      'type' => \TType::LST,
      'etype' => \TType::STRUCT,
      'elem' => dict[
        'type' => \TType::STRUCT,
        'class' => 'B',
        ],
        'format' => 'collection',
      'qualifier' => \TFieldQualifier::T_OPT_IN_REQ_OUT,
      ],
    16 => dict[
      'var' => 'map_of_string_to_self',
      'type' => \TType::MAP,
      'ktype' => \TType::STRING,
      'vtype' => \TType::STRUCT,
      'key' => dict[
        'type' => \TType::STRING,
      ],
      'val' => dict[
        'type' => \TType::STRUCT,
        'class' => 'B',
        ],
        'format' => 'collection',
      'qualifier' => \TFieldQualifier::T_OPT_IN_REQ_OUT,
      ],
    51 => dict[
      'var' => 'optional_just_an_A',
      'type' => \TType::STRUCT,
      'class' => 'A',
      'qualifier' => \TFieldQualifier::T_OPTIONAL,
      ],
    52 => dict[
      'var' => 'optional_set_of_i32',
      'type' => \TType::SET,
      'etype' => \TType::I32,
      'elem' => dict[
        'type' => \TType::I32,
        ],
        'format' => 'collection',
      'qualifier' => \TFieldQualifier::T_OPTIONAL,
      ],
    53 => dict[
      'var' => 'optional_list_of_i32',
      'type' => \TType::LST,
      'etype' => \TType::I32,
      'elem' => dict[
        'type' => \TType::I32,
        ],
        'format' => 'collection',
      'qualifier' => \TFieldQualifier::T_OPTIONAL,
      ],
    54 => dict[
      'var' => 'optional_list_of_string',
      'type' => \TType::LST,
      'etype' => \TType::STRING,
      'elem' => dict[
        'type' => \TType::STRING,
        ],
        'format' => 'collection',
      'qualifier' => \TFieldQualifier::T_OPTIONAL,
      ],
    55 => dict[
      'var' => 'optional_map_of_string_to_i32',
      'type' => \TType::MAP,
      'ktype' => \TType::STRING,
      'vtype' => \TType::I32,
      'key' => dict[
        'type' => \TType::STRING,
      ],
      'val' => dict[
        'type' => \TType::I32,
        ],
        'format' => 'collection',
      'qualifier' => \TFieldQualifier::T_OPTIONAL,
      ],
    56 => dict[
      'var' => 'optional_map_of_string_to_A',
      'type' => \TType::MAP,
      'ktype' => \TType::STRING,
      'vtype' => \TType::STRUCT,
      'key' => dict[
        'type' => \TType::STRING,
      ],
      'val' => dict[
        'type' => \TType::STRUCT,
        'class' => 'A',
        ],
        'format' => 'collection',
      'qualifier' => \TFieldQualifier::T_OPTIONAL,
      ],
    57 => dict[
      'var' => 'optional_map_of_string_to_list_of_i32',
      'type' => \TType::MAP,
      'ktype' => \TType::STRING,
      'vtype' => \TType::LST,
      'key' => dict[
        'type' => \TType::STRING,
      ],
      'val' => dict[
        'type' => \TType::LST,
        'etype' => \TType::I32,
        'elem' => dict[
          'type' => \TType::I32,
          ],
          'format' => 'collection',
        ],
        'format' => 'collection',
      'qualifier' => \TFieldQualifier::T_OPTIONAL,
      ],
    58 => dict[
      'var' => 'optional_map_of_string_to_list_of_A',
      'type' => \TType::MAP,
      'ktype' => \TType::STRING,
      'vtype' => \TType::LST,
      'key' => dict[
        'type' => \TType::STRING,
      ],
      'val' => dict[
        'type' => \TType::LST,
        'etype' => \TType::STRUCT,
        'elem' => dict[
          'type' => \TType::STRUCT,
          'class' => 'A',
          ],
          'format' => 'collection',
        ],
        'format' => 'collection',
      'qualifier' => \TFieldQualifier::T_OPTIONAL,
      ],
    59 => dict[
      'var' => 'optional_map_of_string_to_set_of_i32',
      'type' => \TType::MAP,
      'ktype' => \TType::STRING,
      'vtype' => \TType::SET,
      'key' => dict[
        'type' => \TType::STRING,
      ],
      'val' => dict[
        'type' => \TType::SET,
        'etype' => \TType::I32,
        'elem' => dict[
          'type' => \TType::I32,
          ],
          'format' => 'collection',
        ],
        'format' => 'collection',
      'qualifier' => \TFieldQualifier::T_OPTIONAL,
      ],
    ];
  public static Map<string, int> $_TFIELDMAP = Map {
    'just_an_A' => 1,
    'set_of_i32' => 2,
    'list_of_i32' => 3,
    'list_of_string' => 4,
    'map_of_string_to_i32' => 5,
    'map_of_string_to_A' => 6,
    'map_of_string_to_list_of_i32' => 7,
    'map_of_string_to_list_of_A' => 8,
    'map_of_string_to_set_of_i32' => 9,
    'map_of_string_to_map_of_string_to_i32' => 10,
    'map_of_string_to_map_of_string_to_A' => 11,
    'list_of_set_of_i32' => 12,
    'list_of_map_of_string_to_list_of_A' => 13,
    'list_of_map_of_string_to_A' => 14,
    'list_of_self' => 15,
    'map_of_string_to_self' => 16,
    'optional_just_an_A' => 51,
    'optional_set_of_i32' => 52,
    'optional_list_of_i32' => 53,
    'optional_list_of_string' => 54,
    'optional_map_of_string_to_i32' => 55,
    'optional_map_of_string_to_A' => 56,
    'optional_map_of_string_to_list_of_i32' => 57,
    'optional_map_of_string_to_list_of_A' => 58,
    'optional_map_of_string_to_set_of_i32' => 59,
  };
  const type TShape = shape(
    ?'just_an_A' => ?A::TShape,
    'set_of_i32' => dict<int, bool>,
    'list_of_i32' => vec<int>,
    'list_of_string' => vec<string>,
    'map_of_string_to_i32' => dict<string, int>,
    'map_of_string_to_A' => dict<string, A::TShape>,
    'map_of_string_to_list_of_i32' => dict<string, vec<int>>,
    'map_of_string_to_list_of_A' => dict<string, vec<A::TShape>>,
    'map_of_string_to_set_of_i32' => dict<string, dict<int, bool>>,
    'map_of_string_to_map_of_string_to_i32' => dict<string, dict<string, int>>,
    'map_of_string_to_map_of_string_to_A' => dict<string, dict<string, A::TShape>>,
    'list_of_set_of_i32' => vec<dict<int, bool>>,
    'list_of_map_of_string_to_list_of_A' => vec<dict<string, vec<A::TShape>>>,
    'list_of_map_of_string_to_A' => vec<dict<string, A::TShape>>,
    'list_of_self' => vec<B::TShape>,
    'map_of_string_to_self' => dict<string, B::TShape>,
    ?'optional_just_an_A' => ?A::TShape,
    ?'optional_set_of_i32' => ?dict<int, bool>,
    ?'optional_list_of_i32' => ?vec<int>,
    ?'optional_list_of_string' => ?vec<string>,
    ?'optional_map_of_string_to_i32' => ?dict<string, int>,
    ?'optional_map_of_string_to_A' => ?dict<string, A::TShape>,
    ?'optional_map_of_string_to_list_of_i32' => ?dict<string, vec<int>>,
    ?'optional_map_of_string_to_list_of_A' => ?dict<string, vec<A::TShape>>,
    ?'optional_map_of_string_to_set_of_i32' => ?dict<string, dict<int, bool>>,
    ...
  );
  const int STRUCTURAL_ID = 5337530759322918209;
  /**
   * Original thrift field:-
   * 1: struct module.A just_an_A
   */
  public ?A $just_an_A;
  /**
   * Original thrift field:-
   * 2: set<i32> set_of_i32
   */
  public Set<int> $set_of_i32;
  /**
   * Original thrift field:-
   * 3: list<i32> list_of_i32
   */
  public Vector<int> $list_of_i32;
  /**
   * Original thrift field:-
   * 4: list<string> list_of_string
   */
  public Vector<string> $list_of_string;
  /**
   * Original thrift field:-
   * 5: map<string, i32> map_of_string_to_i32
   */
  public Map<string, int> $map_of_string_to_i32;
  /**
   * Original thrift field:-
   * 6: map<string, struct module.A> map_of_string_to_A
   */
  public Map<string, A> $map_of_string_to_A;
  /**
   * Original thrift field:-
   * 7: map<string, list<i32>> map_of_string_to_list_of_i32
   */
  public Map<string, Vector<int>> $map_of_string_to_list_of_i32;
  /**
   * Original thrift field:-
   * 8: map<string, list<struct module.A>> map_of_string_to_list_of_A
   */
  public Map<string, Vector<A>> $map_of_string_to_list_of_A;
  /**
   * Original thrift field:-
   * 9: map<string, set<i32>> map_of_string_to_set_of_i32
   */
  public Map<string, Set<int>> $map_of_string_to_set_of_i32;
  /**
   * Original thrift field:-
   * 10: map<string, map<string, i32>> map_of_string_to_map_of_string_to_i32
   */
  public Map<string, Map<string, int>> $map_of_string_to_map_of_string_to_i32;
  /**
   * Original thrift field:-
   * 11: map<string, map<string, struct module.A>> map_of_string_to_map_of_string_to_A
   */
  public Map<string, Map<string, A>> $map_of_string_to_map_of_string_to_A;
  /**
   * Original thrift field:-
   * 12: list<set<i32>> list_of_set_of_i32
   */
  public Vector<Set<int>> $list_of_set_of_i32;
  /**
   * Original thrift field:-
   * 13: list<map<string, list<struct module.A>>> list_of_map_of_string_to_list_of_A
   */
  public Vector<Map<string, Vector<A>>> $list_of_map_of_string_to_list_of_A;
  /**
   * Original thrift field:-
   * 14: list<map<string, struct module.A>> list_of_map_of_string_to_A
   */
  public Vector<Map<string, A>> $list_of_map_of_string_to_A;
  /**
   * Original thrift field:-
   * 15: list<struct module.B> list_of_self
   */
  public Vector<B> $list_of_self;
  /**
   * Original thrift field:-
   * 16: map<string, struct module.B> map_of_string_to_self
   */
  public Map<string, B> $map_of_string_to_self;
  /**
   * Original thrift field:-
   * 51: struct module.A optional_just_an_A
   */
  public ?A $optional_just_an_A;
  /**
   * Original thrift field:-
   * 52: set<i32> optional_set_of_i32
   */
  public ?Set<int> $optional_set_of_i32;
  /**
   * Original thrift field:-
   * 53: list<i32> optional_list_of_i32
   */
  public ?Vector<int> $optional_list_of_i32;
  /**
   * Original thrift field:-
   * 54: list<string> optional_list_of_string
   */
  public ?Vector<string> $optional_list_of_string;
  /**
   * Original thrift field:-
   * 55: map<string, i32> optional_map_of_string_to_i32
   */
  public ?Map<string, int> $optional_map_of_string_to_i32;
  /**
   * Original thrift field:-
   * 56: map<string, struct module.A> optional_map_of_string_to_A
   */
  public ?Map<string, A> $optional_map_of_string_to_A;
  /**
   * Original thrift field:-
   * 57: map<string, list<i32>> optional_map_of_string_to_list_of_i32
   */
  public ?Map<string, Vector<int>> $optional_map_of_string_to_list_of_i32;
  /**
   * Original thrift field:-
   * 58: map<string, list<struct module.A>> optional_map_of_string_to_list_of_A
   */
  public ?Map<string, Vector<A>> $optional_map_of_string_to_list_of_A;
  /**
   * Original thrift field:-
   * 59: map<string, set<i32>> optional_map_of_string_to_set_of_i32
   */
  public ?Map<string, Set<int>> $optional_map_of_string_to_set_of_i32;

  public function __construct(?A $just_an_A = null, ?Set<int> $set_of_i32 = null, ?Vector<int> $list_of_i32 = null, ?Vector<string> $list_of_string = null, ?Map<string, int> $map_of_string_to_i32 = null, ?Map<string, A> $map_of_string_to_A = null, ?Map<string, Vector<int>> $map_of_string_to_list_of_i32 = null, ?Map<string, Vector<A>> $map_of_string_to_list_of_A = null, ?Map<string, Set<int>> $map_of_string_to_set_of_i32 = null, ?Map<string, Map<string, int>> $map_of_string_to_map_of_string_to_i32 = null, ?Map<string, Map<string, A>> $map_of_string_to_map_of_string_to_A = null, ?Vector<Set<int>> $list_of_set_of_i32 = null, ?Vector<Map<string, Vector<A>>> $list_of_map_of_string_to_list_of_A = null, ?Vector<Map<string, A>> $list_of_map_of_string_to_A = null, ?Vector<B> $list_of_self = null, ?Map<string, B> $map_of_string_to_self = null, ?A $optional_just_an_A = null, ?Set<int> $optional_set_of_i32 = null, ?Vector<int> $optional_list_of_i32 = null, ?Vector<string> $optional_list_of_string = null, ?Map<string, int> $optional_map_of_string_to_i32 = null, ?Map<string, A> $optional_map_of_string_to_A = null, ?Map<string, Vector<int>> $optional_map_of_string_to_list_of_i32 = null, ?Map<string, Vector<A>> $optional_map_of_string_to_list_of_A = null, ?Map<string, Set<int>> $optional_map_of_string_to_set_of_i32 = null  ) {
    $this->just_an_A = $just_an_A;
    if ($set_of_i32 === null) {
      $this->set_of_i32 = Set {};
    } else {
      $this->set_of_i32 = $set_of_i32;
    }
    if ($list_of_i32 === null) {
      $this->list_of_i32 = Vector {};
    } else {
      $this->list_of_i32 = $list_of_i32;
    }
    if ($list_of_string === null) {
      $this->list_of_string = Vector {};
    } else {
      $this->list_of_string = $list_of_string;
    }
    if ($map_of_string_to_i32 === null) {
      $this->map_of_string_to_i32 = Map {};
    } else {
      $this->map_of_string_to_i32 = $map_of_string_to_i32;
    }
    if ($map_of_string_to_A === null) {
      $this->map_of_string_to_A = Map {};
    } else {
      $this->map_of_string_to_A = $map_of_string_to_A;
    }
    if ($map_of_string_to_list_of_i32 === null) {
      $this->map_of_string_to_list_of_i32 = Map {};
    } else {
      $this->map_of_string_to_list_of_i32 = $map_of_string_to_list_of_i32;
    }
    if ($map_of_string_to_list_of_A === null) {
      $this->map_of_string_to_list_of_A = Map {};
    } else {
      $this->map_of_string_to_list_of_A = $map_of_string_to_list_of_A;
    }
    if ($map_of_string_to_set_of_i32 === null) {
      $this->map_of_string_to_set_of_i32 = Map {};
    } else {
      $this->map_of_string_to_set_of_i32 = $map_of_string_to_set_of_i32;
    }
    if ($map_of_string_to_map_of_string_to_i32 === null) {
      $this->map_of_string_to_map_of_string_to_i32 = Map {};
    } else {
      $this->map_of_string_to_map_of_string_to_i32 = $map_of_string_to_map_of_string_to_i32;
    }
    if ($map_of_string_to_map_of_string_to_A === null) {
      $this->map_of_string_to_map_of_string_to_A = Map {};
    } else {
      $this->map_of_string_to_map_of_string_to_A = $map_of_string_to_map_of_string_to_A;
    }
    if ($list_of_set_of_i32 === null) {
      $this->list_of_set_of_i32 = Vector {};
    } else {
      $this->list_of_set_of_i32 = $list_of_set_of_i32;
    }
    if ($list_of_map_of_string_to_list_of_A === null) {
      $this->list_of_map_of_string_to_list_of_A = Vector {};
    } else {
      $this->list_of_map_of_string_to_list_of_A = $list_of_map_of_string_to_list_of_A;
    }
    if ($list_of_map_of_string_to_A === null) {
      $this->list_of_map_of_string_to_A = Vector {};
    } else {
      $this->list_of_map_of_string_to_A = $list_of_map_of_string_to_A;
    }
    if ($list_of_self === null) {
      $this->list_of_self = Vector {};
    } else {
      $this->list_of_self = $list_of_self;
    }
    if ($map_of_string_to_self === null) {
      $this->map_of_string_to_self = Map {};
    } else {
      $this->map_of_string_to_self = $map_of_string_to_self;
    }
    $this->optional_just_an_A = $optional_just_an_A;
    $this->optional_set_of_i32 = $optional_set_of_i32;
    $this->optional_list_of_i32 = $optional_list_of_i32;
    $this->optional_list_of_string = $optional_list_of_string;
    $this->optional_map_of_string_to_i32 = $optional_map_of_string_to_i32;
    $this->optional_map_of_string_to_A = $optional_map_of_string_to_A;
    $this->optional_map_of_string_to_list_of_i32 = $optional_map_of_string_to_list_of_i32;
    $this->optional_map_of_string_to_list_of_A = $optional_map_of_string_to_list_of_A;
    $this->optional_map_of_string_to_set_of_i32 = $optional_map_of_string_to_set_of_i32;
  }

  public function getName(): string {
    return 'B';
  }

  public static function __fromShape(self::TShape $shape): this {
    $me = /* HH_IGNORE_ERROR[4060] */ new static();
    $me->just_an_A = Shapes::idx($shape, 'just_an_A') === null ? null : A::__fromShape(\nullthrows(Shapes::idx($shape, 'just_an_A')));
    $me->set_of_i32 = new Set(Keyset\keys($shape['set_of_i32']));
    $me->list_of_i32 = (new Vector($shape['list_of_i32']));
    $me->list_of_string = (new Vector($shape['list_of_string']));
    $me->map_of_string_to_i32 = (new Map($shape['map_of_string_to_i32']));
    $me->map_of_string_to_A = (new Map($shape['map_of_string_to_A']))->map(
      $val0 ==> A::__fromShape($val0),
    );
    $me->map_of_string_to_list_of_i32 = (new Map($shape['map_of_string_to_list_of_i32']))->map(
      $val1 ==> (new Vector($val1)),
    );
    $me->map_of_string_to_list_of_A = (new Map($shape['map_of_string_to_list_of_A']))->map(
      $val2 ==> (new Vector($val2))->map(
        $val3 ==> A::__fromShape($val3),
      ),
    );
    $me->map_of_string_to_set_of_i32 = (new Map($shape['map_of_string_to_set_of_i32']))->map(
      $val4 ==> new Set(Keyset\keys($val4)),
    );
    $me->map_of_string_to_map_of_string_to_i32 = (new Map($shape['map_of_string_to_map_of_string_to_i32']))->map(
      $val5 ==> (new Map($val5)),
    );
    $me->map_of_string_to_map_of_string_to_A = (new Map($shape['map_of_string_to_map_of_string_to_A']))->map(
      $val6 ==> (new Map($val6))->map(
        $val7 ==> A::__fromShape($val7),
      ),
    );
    $me->list_of_set_of_i32 = (new Vector($shape['list_of_set_of_i32']))->map(
      $val8 ==> new Set(Keyset\keys($val8)),
    );
    $me->list_of_map_of_string_to_list_of_A = (new Vector($shape['list_of_map_of_string_to_list_of_A']))->map(
      $val9 ==> (new Map($val9))->map(
        $val10 ==> (new Vector($val10))->map(
          $val11 ==> A::__fromShape($val11),
        ),
      ),
    );
    $me->list_of_map_of_string_to_A = (new Vector($shape['list_of_map_of_string_to_A']))->map(
      $val12 ==> (new Map($val12))->map(
        $val13 ==> A::__fromShape($val13),
      ),
    );
    $me->list_of_self = (new Vector($shape['list_of_self']))->map(
      $val14 ==> B::__fromShape($val14),
    );
    $me->map_of_string_to_self = (new Map($shape['map_of_string_to_self']))->map(
      $val15 ==> B::__fromShape($val15),
    );
    $me->optional_just_an_A = Shapes::idx($shape, 'optional_just_an_A') === null ? null : A::__fromShape(\nullthrows(Shapes::idx($shape, 'optional_just_an_A')));
    $me->optional_set_of_i32 = Shapes::idx($shape, 'optional_set_of_i32') === null ? null : new Set(Keyset\keys(\nullthrows(Shapes::idx($shape, 'optional_set_of_i32'))));
    $me->optional_list_of_i32 = Shapes::idx($shape, 'optional_list_of_i32') === null ? null : 
      (new Vector(Shapes::idx($shape, 'optional_list_of_i32')));
    $me->optional_list_of_string = Shapes::idx($shape, 'optional_list_of_string') === null ? null : 
      (new Vector(Shapes::idx($shape, 'optional_list_of_string')));
    $me->optional_map_of_string_to_i32 = Shapes::idx($shape, 'optional_map_of_string_to_i32') === null ? null : 
      (new Map(Shapes::idx($shape, 'optional_map_of_string_to_i32')));
    $me->optional_map_of_string_to_A = Shapes::idx($shape, 'optional_map_of_string_to_A') === null ? null : 
      (new Map(Shapes::idx($shape, 'optional_map_of_string_to_A')))->map(
        $val16 ==> A::__fromShape($val16),
      );
    $me->optional_map_of_string_to_list_of_i32 = Shapes::idx($shape, 'optional_map_of_string_to_list_of_i32') === null ? null : 
      (new Map(Shapes::idx($shape, 'optional_map_of_string_to_list_of_i32')))->map(
        $val17 ==> (new Vector($val17)),
      );
    $me->optional_map_of_string_to_list_of_A = Shapes::idx($shape, 'optional_map_of_string_to_list_of_A') === null ? null : 
      (new Map(Shapes::idx($shape, 'optional_map_of_string_to_list_of_A')))->map(
        $val18 ==> (new Vector($val18))->map(
          $val19 ==> A::__fromShape($val19),
        ),
      );
    $me->optional_map_of_string_to_set_of_i32 = Shapes::idx($shape, 'optional_map_of_string_to_set_of_i32') === null ? null : 
      (new Map(Shapes::idx($shape, 'optional_map_of_string_to_set_of_i32')))->map(
        $val20 ==> new Set(Keyset\keys($val20)),
      );
    return $me;
  }

  public function __toShape(): self::TShape {
    return shape(
      'just_an_A' => $this->just_an_A?->__toShape(),
      'set_of_i32' => ThriftUtil::toDArray(Dict\fill_keys($this->set_of_i32->toValuesArray(), true)),
      'list_of_i32' => vec($this->list_of_i32),
      'list_of_string' => vec($this->list_of_string),
      'map_of_string_to_i32' => dict($this->map_of_string_to_i32),
      'map_of_string_to_A' => $this->map_of_string_to_A->map(
        $_val0 ==> $_val0->__toShape(),
      )
        |> dict($$),
      'map_of_string_to_list_of_i32' => $this->map_of_string_to_list_of_i32->map(
        $_val0 ==> vec($_val0),
      )
        |> dict($$),
      'map_of_string_to_list_of_A' => $this->map_of_string_to_list_of_A->map(
        $_val0 ==> $_val0->map(
          $_val1 ==> $_val1->__toShape(),
        )
          |> vec($$),
      )
        |> dict($$),
      'map_of_string_to_set_of_i32' => $this->map_of_string_to_set_of_i32->map(
        $_val0 ==> ThriftUtil::toDArray(Dict\fill_keys($_val0, true)),
      )
        |> dict($$),
      'map_of_string_to_map_of_string_to_i32' => $this->map_of_string_to_map_of_string_to_i32->map(
        $_val0 ==> dict($_val0),
      )
        |> dict($$),
      'map_of_string_to_map_of_string_to_A' => $this->map_of_string_to_map_of_string_to_A->map(
        $_val0 ==> $_val0->map(
          $_val1 ==> $_val1->__toShape(),
        )
          |> dict($$),
      )
        |> dict($$),
      'list_of_set_of_i32' => $this->list_of_set_of_i32->map(
        $_val0 ==> ThriftUtil::toDArray(Dict\fill_keys($_val0, true)),
      )
        |> vec($$),
      'list_of_map_of_string_to_list_of_A' => $this->list_of_map_of_string_to_list_of_A->map(
        $_val0 ==> $_val0->map(
          $_val1 ==> $_val1->map(
            $_val2 ==> $_val2->__toShape(),
          )
            |> vec($$),
        )
          |> dict($$),
      )
        |> vec($$),
      'list_of_map_of_string_to_A' => $this->list_of_map_of_string_to_A->map(
        $_val0 ==> $_val0->map(
          $_val1 ==> $_val1->__toShape(),
        )
          |> dict($$),
      )
        |> vec($$),
      'list_of_self' => $this->list_of_self->map(
        $_val0 ==> $_val0->__toShape(),
      )
        |> vec($$),
      'map_of_string_to_self' => $this->map_of_string_to_self->map(
        $_val0 ==> $_val0->__toShape(),
      )
        |> dict($$),
      'optional_just_an_A' => $this->optional_just_an_A?->__toShape(),
      'optional_set_of_i32' => $this->optional_set_of_i32
        |> $$ === null ? null : ThriftUtil::toDArray(Dict\fill_keys($$->toValuesArray(), true)),
      'optional_list_of_i32' => $this->optional_list_of_i32
        |> $$ === null ? null : vec($$),
      'optional_list_of_string' => $this->optional_list_of_string
        |> $$ === null ? null : vec($$),
      'optional_map_of_string_to_i32' => $this->optional_map_of_string_to_i32
        |> $$ === null ? null : dict($$),
      'optional_map_of_string_to_A' => $this->optional_map_of_string_to_A?->map(
        $_val0 ==> $_val0->__toShape(),
      )
        |> $$ === null ? null : dict($$),
      'optional_map_of_string_to_list_of_i32' => $this->optional_map_of_string_to_list_of_i32?->map(
        $_val0 ==> vec($_val0),
      )
        |> $$ === null ? null : dict($$),
      'optional_map_of_string_to_list_of_A' => $this->optional_map_of_string_to_list_of_A?->map(
        $_val0 ==> $_val0->map(
          $_val1 ==> $_val1->__toShape(),
        )
          |> vec($$),
      )
        |> $$ === null ? null : dict($$),
      'optional_map_of_string_to_set_of_i32' => $this->optional_map_of_string_to_set_of_i32?->map(
        $_val0 ==> ThriftUtil::toDArray(Dict\fill_keys($_val0, true)),
      )
        |> $$ === null ? null : dict($$),
    );
  }
}

