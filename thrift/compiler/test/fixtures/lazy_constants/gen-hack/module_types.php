<?hh // strict
/**
 * Autogenerated by Thrift
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */

/**
 * Original thrift enum:-
 * City
 */
enum City: int {
  NYC = 0;
  MPK = 1;
  SEA = 2;
  LON = 3;
}
type CityType = City;

/**
 * Original thrift enum:-
 * Company
 */
enum Company: int {
  FACEBOOK = 0;
  WHATSAPP = 1;
  OCULUS = 2;
  INSTAGRAM = 3;
}
type CompanyType = Company;

/**
 * Original thrift struct:-
 * Internship
 */
class Internship implements \IThriftStruct {
  use \ThriftSerializationTrait;

  public static dict<int, dict<string, mixed>> $_TSPEC = dict[
    1 => dict[
      'var' => 'weeks',
      'type' => \TType::I32,
      'qualifier' => \TFieldQualifier::T_REQUIRED,
      ],
    2 => dict[
      'var' => 'title',
      'type' => \TType::STRING,
      'qualifier' => \TFieldQualifier::T_OPT_IN_REQ_OUT,
      ],
    3 => dict[
      'var' => 'employer',
      'type' => \TType::I32,
      'enum' => 'Company',
      'qualifier' => \TFieldQualifier::T_OPTIONAL,
      ],
    ];
  public static Map<string, int> $_TFIELDMAP = Map {
    'weeks' => 1,
    'title' => 2,
    'employer' => 3,
  };
  const int STRUCTURAL_ID = 749038867953722654;
  /**
   * Original thrift field:-
   * 1: i32 weeks
   */
  public int $weeks;
  /**
   * Original thrift field:-
   * 2: string title
   */
  public string $title;
  /**
   * Original thrift field:-
   * 3: enum module.Company employer
   */
  public ?Company $employer;

  public function __construct(?int $weeks = null, ?string $title = null, ?Company $employer = null  ) {
    if ($weeks === null) {
      $this->weeks = 0;
    } else {
      $this->weeks = $weeks;
    }
    if ($title === null) {
      $this->title = '';
    } else {
      $this->title = $title;
    }
    $this->employer = $employer;
  }

  public function getName(): string {
    return 'Internship';
  }

}

/**
 * Original thrift struct:-
 * Range
 */
class Range implements \IThriftStruct {
  use \ThriftSerializationTrait;

  public static dict<int, dict<string, mixed>> $_TSPEC = dict[
    1 => dict[
      'var' => 'min',
      'type' => \TType::I32,
      'qualifier' => \TFieldQualifier::T_REQUIRED,
      ],
    2 => dict[
      'var' => 'max',
      'type' => \TType::I32,
      'qualifier' => \TFieldQualifier::T_REQUIRED,
      ],
    ];
  public static Map<string, int> $_TFIELDMAP = Map {
    'min' => 1,
    'max' => 2,
  };
  const int STRUCTURAL_ID = 6850388386457434767;
  /**
   * Original thrift field:-
   * 1: i32 min
   */
  public int $min;
  /**
   * Original thrift field:-
   * 2: i32 max
   */
  public int $max;

  public function __construct(?int $min = null, ?int $max = null  ) {
    if ($min === null) {
      $this->min = 0;
    } else {
      $this->min = $min;
    }
    if ($max === null) {
      $this->max = 0;
    } else {
      $this->max = $max;
    }
  }

  public function getName(): string {
    return 'Range';
  }

}

