/**
 * Autogenerated by Thrift for src/module.thrift
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated @nocommit
 */
#include "thrift/compiler/test/fixtures/optionals/gen-cpp2/module_types.h"
#include "thrift/compiler/test/fixtures/optionals/gen-cpp2/module_types.tcc"

#include <thrift/lib/cpp2/gen/module_types_cpp.h>

#include "thrift/compiler/test/fixtures/optionals/gen-cpp2/module_data.h"


namespace apache { namespace thrift {

constexpr std::size_t const TEnumTraits<::cpp2::Animal>::size;
folly::Range<::cpp2::Animal const*> const TEnumTraits<::cpp2::Animal>::values = folly::range(TEnumDataStorage<::cpp2::Animal>::values);
folly::Range<folly::StringPiece const*> const TEnumTraits<::cpp2::Animal>::names = folly::range(TEnumDataStorage<::cpp2::Animal>::names);

char const* TEnumTraits<::cpp2::Animal>::findName(type value) {
  using factory = ::cpp2::_Animal_EnumMapFactory;
  static folly::Indestructible<factory::ValuesToNamesMapType> const map{
      factory::makeValuesToNamesMap()};
  auto found = map->find(value);
  return found == map->end() ? nullptr : found->second;
}

bool TEnumTraits<::cpp2::Animal>::findValue(char const* name, type* out) {
  using factory = ::cpp2::_Animal_EnumMapFactory;
  static folly::Indestructible<factory::NamesToValuesMapType> const map{
      factory::makeNamesToValuesMap()};
  auto found = map->find(name);
  return found == map->end() ? false : (*out = found->second, true);
}

}} // apache::thrift

namespace cpp2 {
FOLLY_PUSH_WARNING
FOLLY_GNU_DISABLE_WARNING("-Wdeprecated-declarations")
const _Animal_EnumMapFactory::ValuesToNamesMapType _Animal_VALUES_TO_NAMES = _Animal_EnumMapFactory::makeValuesToNamesMap();
const _Animal_EnumMapFactory::NamesToValuesMapType _Animal_NAMES_TO_VALUES = _Animal_EnumMapFactory::makeNamesToValuesMap();
FOLLY_POP_WARNING

} // cpp2

namespace apache {
namespace thrift {
namespace detail {

void TccStructTraits<::cpp2::Color>::translateFieldName(
    folly::StringPiece _fname,
    int16_t& fid,
    apache::thrift::protocol::TType& _ftype) noexcept {
  using data = apache::thrift::TStructDataStorage<::cpp2::Color>;
  static const st::translate_field_name_table table{
      data::fields_size,
      data::fields_names.data(),
      data::fields_ids.data(),
      data::fields_types.data()};
  st::translate_field_name(_fname, fid, _ftype, table);
}

} // namespace detail
} // namespace thrift
} // namespace apache

namespace cpp2 {


Color::Color(apache::thrift::FragileConstructor, double red__arg, double green__arg, double blue__arg, double alpha__arg) :
    __fbthrift_field_red(std::move(red__arg)),
    __fbthrift_field_green(std::move(green__arg)),
    __fbthrift_field_blue(std::move(blue__arg)),
    __fbthrift_field_alpha(std::move(alpha__arg)) {
  __isset.set(folly::index_constant<0>(), true);
  __isset.set(folly::index_constant<1>(), true);
  __isset.set(folly::index_constant<2>(), true);
  __isset.set(folly::index_constant<3>(), true);
}


void Color::__clear() {
  // clear all fields
  this->__fbthrift_field_red = double();
  this->__fbthrift_field_green = double();
  this->__fbthrift_field_blue = double();
  this->__fbthrift_field_alpha = double();
  __isset = {};
}

bool Color::operator==(const Color& rhs) const {
  (void)rhs;
  auto& lhs = *this;
  (void)lhs;
  if (!(lhs.red_ref() == rhs.red_ref())) {
    return false;
  }
  if (!(lhs.green_ref() == rhs.green_ref())) {
    return false;
  }
  if (!(lhs.blue_ref() == rhs.blue_ref())) {
    return false;
  }
  if (!(lhs.alpha_ref() == rhs.alpha_ref())) {
    return false;
  }
  return true;
}

bool Color::operator<(const Color& rhs) const {
  (void)rhs;
  auto& lhs = *this;
  (void)lhs;
  if (!(lhs.red_ref() == rhs.red_ref())) {
    return lhs.red_ref() < rhs.red_ref();
  }
  if (!(lhs.green_ref() == rhs.green_ref())) {
    return lhs.green_ref() < rhs.green_ref();
  }
  if (!(lhs.blue_ref() == rhs.blue_ref())) {
    return lhs.blue_ref() < rhs.blue_ref();
  }
  if (!(lhs.alpha_ref() == rhs.alpha_ref())) {
    return lhs.alpha_ref() < rhs.alpha_ref();
  }
  return false;
}


void swap(Color& a, Color& b) {
  using ::std::swap;
  swap(a.red_ref().value(), b.red_ref().value());
  swap(a.green_ref().value(), b.green_ref().value());
  swap(a.blue_ref().value(), b.blue_ref().value());
  swap(a.alpha_ref().value(), b.alpha_ref().value());
  swap(a.__isset, b.__isset);
}

template void Color::readNoXfer<>(apache::thrift::BinaryProtocolReader*);
template uint32_t Color::write<>(apache::thrift::BinaryProtocolWriter*) const;
template uint32_t Color::serializedSize<>(apache::thrift::BinaryProtocolWriter const*) const;
template uint32_t Color::serializedSizeZC<>(apache::thrift::BinaryProtocolWriter const*) const;
template void Color::readNoXfer<>(apache::thrift::CompactProtocolReader*);
template uint32_t Color::write<>(apache::thrift::CompactProtocolWriter*) const;
template uint32_t Color::serializedSize<>(apache::thrift::CompactProtocolWriter const*) const;
template uint32_t Color::serializedSizeZC<>(apache::thrift::CompactProtocolWriter const*) const;



} // cpp2

namespace apache {
namespace thrift {
namespace detail {

void TccStructTraits<::cpp2::Vehicle>::translateFieldName(
    folly::StringPiece _fname,
    int16_t& fid,
    apache::thrift::protocol::TType& _ftype) noexcept {
  using data = apache::thrift::TStructDataStorage<::cpp2::Vehicle>;
  static const st::translate_field_name_table table{
      data::fields_size,
      data::fields_names.data(),
      data::fields_ids.data(),
      data::fields_types.data()};
  st::translate_field_name(_fname, fid, _ftype, table);
}

} // namespace detail
} // namespace thrift
} // namespace apache

namespace cpp2 {

Vehicle::Vehicle(const Vehicle&) = default;
Vehicle& Vehicle::operator=(const Vehicle&) = default;
Vehicle::Vehicle() :
      __fbthrift_field_hasAC(static_cast<bool>(false)) {
}


Vehicle::~Vehicle() {}

Vehicle::Vehicle(Vehicle&& other) noexcept  :
    __fbthrift_field_color(std::move(other.__fbthrift_field_color)),
    __fbthrift_field_licensePlate(std::move(other.__fbthrift_field_licensePlate)),
    __fbthrift_field_description(std::move(other.__fbthrift_field_description)),
    __fbthrift_field_name(std::move(other.__fbthrift_field_name)),
    __fbthrift_field_hasAC(std::move(other.__fbthrift_field_hasAC)),
    __isset(other.__isset) {
}

Vehicle& Vehicle::operator=(FOLLY_MAYBE_UNUSED Vehicle&& other) noexcept {
    this->__fbthrift_field_color = std::move(other.__fbthrift_field_color);
    this->__fbthrift_field_licensePlate = std::move(other.__fbthrift_field_licensePlate);
    this->__fbthrift_field_description = std::move(other.__fbthrift_field_description);
    this->__fbthrift_field_name = std::move(other.__fbthrift_field_name);
    this->__fbthrift_field_hasAC = std::move(other.__fbthrift_field_hasAC);
    __isset = other.__isset;
    return *this;
}


Vehicle::Vehicle(apache::thrift::FragileConstructor, ::cpp2::Color color__arg, ::std::string licensePlate__arg, ::std::string description__arg, ::std::string name__arg, bool hasAC__arg) :
    __fbthrift_field_color(std::move(color__arg)),
    __fbthrift_field_licensePlate(std::move(licensePlate__arg)),
    __fbthrift_field_description(std::move(description__arg)),
    __fbthrift_field_name(std::move(name__arg)),
    __fbthrift_field_hasAC(std::move(hasAC__arg)) {
  __isset.set(folly::index_constant<0>(), true);
  __isset.set(folly::index_constant<1>(), true);
  __isset.set(folly::index_constant<2>(), true);
  __isset.set(folly::index_constant<3>(), true);
  __isset.set(folly::index_constant<4>(), true);
}


void Vehicle::__clear() {
  // clear all fields
  this->__fbthrift_field_color.__clear();
  this->__fbthrift_field_licensePlate = apache::thrift::StringTraits<std::string>::fromStringLiteral("");
  this->__fbthrift_field_description = apache::thrift::StringTraits<std::string>::fromStringLiteral("");
  this->__fbthrift_field_name = apache::thrift::StringTraits<std::string>::fromStringLiteral("");
  this->__fbthrift_field_hasAC = static_cast<bool>(false);
  __isset = {};
}

bool Vehicle::operator==(const Vehicle& rhs) const {
  (void)rhs;
  auto& lhs = *this;
  (void)lhs;
  if (!(lhs.color_ref() == rhs.color_ref())) {
    return false;
  }
  if (!(lhs.licensePlate_ref() == rhs.licensePlate_ref())) {
    return false;
  }
  if (!(lhs.description_ref() == rhs.description_ref())) {
    return false;
  }
  if (!(lhs.name_ref() == rhs.name_ref())) {
    return false;
  }
  if (!(lhs.hasAC_ref() == rhs.hasAC_ref())) {
    return false;
  }
  return true;
}

bool Vehicle::operator<(const Vehicle& rhs) const {
  (void)rhs;
  auto& lhs = *this;
  (void)lhs;
  if (!(lhs.color_ref() == rhs.color_ref())) {
    return lhs.color_ref() < rhs.color_ref();
  }
  if (!(lhs.licensePlate_ref() == rhs.licensePlate_ref())) {
    return lhs.licensePlate_ref() < rhs.licensePlate_ref();
  }
  if (!(lhs.description_ref() == rhs.description_ref())) {
    return lhs.description_ref() < rhs.description_ref();
  }
  if (!(lhs.name_ref() == rhs.name_ref())) {
    return lhs.name_ref() < rhs.name_ref();
  }
  if (!(lhs.hasAC_ref() == rhs.hasAC_ref())) {
    return lhs.hasAC_ref() < rhs.hasAC_ref();
  }
  return false;
}

const ::cpp2::Color& Vehicle::get_color() const& {
  return __fbthrift_field_color;
}

::cpp2::Color Vehicle::get_color() && {
  return std::move(__fbthrift_field_color);
}


void swap(Vehicle& a, Vehicle& b) {
  using ::std::swap;
  swap(a.color_ref().value(), b.color_ref().value());
  swap(a.licensePlate_ref().value_unchecked(), b.licensePlate_ref().value_unchecked());
  swap(a.description_ref().value_unchecked(), b.description_ref().value_unchecked());
  swap(a.name_ref().value_unchecked(), b.name_ref().value_unchecked());
  swap(a.hasAC_ref().value_unchecked(), b.hasAC_ref().value_unchecked());
  swap(a.__isset, b.__isset);
}

template void Vehicle::readNoXfer<>(apache::thrift::BinaryProtocolReader*);
template uint32_t Vehicle::write<>(apache::thrift::BinaryProtocolWriter*) const;
template uint32_t Vehicle::serializedSize<>(apache::thrift::BinaryProtocolWriter const*) const;
template uint32_t Vehicle::serializedSizeZC<>(apache::thrift::BinaryProtocolWriter const*) const;
template void Vehicle::readNoXfer<>(apache::thrift::CompactProtocolReader*);
template uint32_t Vehicle::write<>(apache::thrift::CompactProtocolWriter*) const;
template uint32_t Vehicle::serializedSize<>(apache::thrift::CompactProtocolWriter const*) const;
template uint32_t Vehicle::serializedSizeZC<>(apache::thrift::CompactProtocolWriter const*) const;

static_assert(
    ::apache::thrift::detail::st::gen_check_json<
        Vehicle,
        ::apache::thrift::type_class::structure,
        ::cpp2::Color>,
    "inconsistent use of json option");

static_assert(
    ::apache::thrift::detail::st::gen_check_nimble<
        Vehicle,
        ::apache::thrift::type_class::structure,
        ::cpp2::Color>,
    "inconsistent use of nimble option");

} // cpp2

namespace apache {
namespace thrift {
namespace detail {

void TccStructTraits<::cpp2::Person>::translateFieldName(
    folly::StringPiece _fname,
    int16_t& fid,
    apache::thrift::protocol::TType& _ftype) noexcept {
  using data = apache::thrift::TStructDataStorage<::cpp2::Person>;
  static const st::translate_field_name_table table{
      data::fields_size,
      data::fields_names.data(),
      data::fields_ids.data(),
      data::fields_types.data()};
  st::translate_field_name(_fname, fid, _ftype, table);
}

} // namespace detail
} // namespace thrift
} // namespace apache

namespace cpp2 {

Person::Person(const Person&) = default;
Person& Person::operator=(const Person&) = default;
Person::Person() :
      __fbthrift_field_id(),
      __fbthrift_field_age(),
      __fbthrift_field_bestFriend(),
      __fbthrift_field_afraidOfAnimal() {
}


Person::~Person() {}

Person::Person(Person&& other) noexcept  :
    __fbthrift_field_id(std::move(other.__fbthrift_field_id)),
    __fbthrift_field_name(std::move(other.__fbthrift_field_name)),
    __fbthrift_field_age(std::move(other.__fbthrift_field_age)),
    __fbthrift_field_address(std::move(other.__fbthrift_field_address)),
    __fbthrift_field_favoriteColor(std::move(other.__fbthrift_field_favoriteColor)),
    __fbthrift_field_friends(std::move(other.__fbthrift_field_friends)),
    __fbthrift_field_bestFriend(std::move(other.__fbthrift_field_bestFriend)),
    __fbthrift_field_petNames(std::move(other.__fbthrift_field_petNames)),
    __fbthrift_field_afraidOfAnimal(std::move(other.__fbthrift_field_afraidOfAnimal)),
    __fbthrift_field_vehicles(std::move(other.__fbthrift_field_vehicles)),
    __isset(other.__isset) {
}

Person& Person::operator=(FOLLY_MAYBE_UNUSED Person&& other) noexcept {
    this->__fbthrift_field_id = std::move(other.__fbthrift_field_id);
    this->__fbthrift_field_name = std::move(other.__fbthrift_field_name);
    this->__fbthrift_field_age = std::move(other.__fbthrift_field_age);
    this->__fbthrift_field_address = std::move(other.__fbthrift_field_address);
    this->__fbthrift_field_favoriteColor = std::move(other.__fbthrift_field_favoriteColor);
    this->__fbthrift_field_friends = std::move(other.__fbthrift_field_friends);
    this->__fbthrift_field_bestFriend = std::move(other.__fbthrift_field_bestFriend);
    this->__fbthrift_field_petNames = std::move(other.__fbthrift_field_petNames);
    this->__fbthrift_field_afraidOfAnimal = std::move(other.__fbthrift_field_afraidOfAnimal);
    this->__fbthrift_field_vehicles = std::move(other.__fbthrift_field_vehicles);
    __isset = other.__isset;
    return *this;
}


Person::Person(apache::thrift::FragileConstructor, ::cpp2::PersonID id__arg, ::std::string name__arg, ::std::int16_t age__arg, ::std::string address__arg, ::cpp2::Color favoriteColor__arg, ::std::set<::cpp2::PersonID> friends__arg, ::cpp2::PersonID bestFriend__arg, ::std::map<::cpp2::Animal, ::std::string> petNames__arg, ::cpp2::Animal afraidOfAnimal__arg, ::std::vector<::cpp2::Vehicle> vehicles__arg) :
    __fbthrift_field_id(std::move(id__arg)),
    __fbthrift_field_name(std::move(name__arg)),
    __fbthrift_field_age(std::move(age__arg)),
    __fbthrift_field_address(std::move(address__arg)),
    __fbthrift_field_favoriteColor(std::move(favoriteColor__arg)),
    __fbthrift_field_friends(std::move(friends__arg)),
    __fbthrift_field_bestFriend(std::move(bestFriend__arg)),
    __fbthrift_field_petNames(std::move(petNames__arg)),
    __fbthrift_field_afraidOfAnimal(std::move(afraidOfAnimal__arg)),
    __fbthrift_field_vehicles(std::move(vehicles__arg)) {
  __isset.set(folly::index_constant<0>(), true);
  __isset.set(folly::index_constant<1>(), true);
  __isset.set(folly::index_constant<2>(), true);
  __isset.set(folly::index_constant<3>(), true);
  __isset.set(folly::index_constant<4>(), true);
  __isset.set(folly::index_constant<5>(), true);
  __isset.set(folly::index_constant<6>(), true);
  __isset.set(folly::index_constant<7>(), true);
  __isset.set(folly::index_constant<8>(), true);
  __isset.set(folly::index_constant<9>(), true);
}


void Person::__clear() {
  // clear all fields
  this->__fbthrift_field_id = ::cpp2::PersonID();
  this->__fbthrift_field_name = apache::thrift::StringTraits<std::string>::fromStringLiteral("");
  this->__fbthrift_field_age = ::std::int16_t();
  this->__fbthrift_field_address = apache::thrift::StringTraits<std::string>::fromStringLiteral("");
  this->__fbthrift_field_favoriteColor.__clear();
  this->__fbthrift_field_friends.clear();
  this->__fbthrift_field_bestFriend = ::cpp2::PersonID();
  this->__fbthrift_field_petNames.clear();
  this->__fbthrift_field_afraidOfAnimal = ::cpp2::Animal();
  this->__fbthrift_field_vehicles.clear();
  __isset = {};
}

bool Person::operator==(const Person& rhs) const {
  (void)rhs;
  auto& lhs = *this;
  (void)lhs;
  if (!(lhs.id_ref() == rhs.id_ref())) {
    return false;
  }
  if (!(lhs.name_ref() == rhs.name_ref())) {
    return false;
  }
  if (!(lhs.age_ref() == rhs.age_ref())) {
    return false;
  }
  if (!(lhs.address_ref() == rhs.address_ref())) {
    return false;
  }
  if (!(lhs.favoriteColor_ref() == rhs.favoriteColor_ref())) {
    return false;
  }
  if (!(lhs.friends_ref() == rhs.friends_ref())) {
    return false;
  }
  if (!(lhs.bestFriend_ref() == rhs.bestFriend_ref())) {
    return false;
  }
  if (!(lhs.petNames_ref() == rhs.petNames_ref())) {
    return false;
  }
  if (!(lhs.afraidOfAnimal_ref() == rhs.afraidOfAnimal_ref())) {
    return false;
  }
  if (!(lhs.vehicles_ref() == rhs.vehicles_ref())) {
    return false;
  }
  return true;
}

bool Person::operator<(const Person& rhs) const {
  (void)rhs;
  auto& lhs = *this;
  (void)lhs;
  if (!(lhs.id_ref() == rhs.id_ref())) {
    return lhs.id_ref() < rhs.id_ref();
  }
  if (!(lhs.name_ref() == rhs.name_ref())) {
    return lhs.name_ref() < rhs.name_ref();
  }
  if (!(lhs.age_ref() == rhs.age_ref())) {
    return lhs.age_ref() < rhs.age_ref();
  }
  if (!(lhs.address_ref() == rhs.address_ref())) {
    return lhs.address_ref() < rhs.address_ref();
  }
  if (!(lhs.favoriteColor_ref() == rhs.favoriteColor_ref())) {
    return lhs.favoriteColor_ref() < rhs.favoriteColor_ref();
  }
  if (!(lhs.friends_ref() == rhs.friends_ref())) {
    return lhs.friends_ref() < rhs.friends_ref();
  }
  if (!(lhs.bestFriend_ref() == rhs.bestFriend_ref())) {
    return lhs.bestFriend_ref() < rhs.bestFriend_ref();
  }
  if (!(lhs.petNames_ref() == rhs.petNames_ref())) {
    return lhs.petNames_ref() < rhs.petNames_ref();
  }
  if (!(lhs.afraidOfAnimal_ref() == rhs.afraidOfAnimal_ref())) {
    return lhs.afraidOfAnimal_ref() < rhs.afraidOfAnimal_ref();
  }
  if (!(lhs.vehicles_ref() == rhs.vehicles_ref())) {
    return lhs.vehicles_ref() < rhs.vehicles_ref();
  }
  return false;
}

const ::cpp2::Color* Person::get_favoriteColor() const& {
  return favoriteColor_ref().has_value() ? std::addressof(__fbthrift_field_favoriteColor) : nullptr;
}

::cpp2::Color* Person::get_favoriteColor() & {
  return favoriteColor_ref().has_value() ? std::addressof(__fbthrift_field_favoriteColor) : nullptr;
}

const ::std::set<::cpp2::PersonID>* Person::get_friends() const& {
  return friends_ref().has_value() ? std::addressof(__fbthrift_field_friends) : nullptr;
}

::std::set<::cpp2::PersonID>* Person::get_friends() & {
  return friends_ref().has_value() ? std::addressof(__fbthrift_field_friends) : nullptr;
}

const ::std::map<::cpp2::Animal, ::std::string>* Person::get_petNames() const& {
  return petNames_ref().has_value() ? std::addressof(__fbthrift_field_petNames) : nullptr;
}

::std::map<::cpp2::Animal, ::std::string>* Person::get_petNames() & {
  return petNames_ref().has_value() ? std::addressof(__fbthrift_field_petNames) : nullptr;
}

const ::std::vector<::cpp2::Vehicle>* Person::get_vehicles() const& {
  return vehicles_ref().has_value() ? std::addressof(__fbthrift_field_vehicles) : nullptr;
}

::std::vector<::cpp2::Vehicle>* Person::get_vehicles() & {
  return vehicles_ref().has_value() ? std::addressof(__fbthrift_field_vehicles) : nullptr;
}


void swap(Person& a, Person& b) {
  using ::std::swap;
  swap(a.id_ref().value(), b.id_ref().value());
  swap(a.name_ref().value(), b.name_ref().value());
  swap(a.age_ref().value_unchecked(), b.age_ref().value_unchecked());
  swap(a.address_ref().value_unchecked(), b.address_ref().value_unchecked());
  swap(a.favoriteColor_ref().value_unchecked(), b.favoriteColor_ref().value_unchecked());
  swap(a.friends_ref().value_unchecked(), b.friends_ref().value_unchecked());
  swap(a.bestFriend_ref().value_unchecked(), b.bestFriend_ref().value_unchecked());
  swap(a.petNames_ref().value_unchecked(), b.petNames_ref().value_unchecked());
  swap(a.afraidOfAnimal_ref().value_unchecked(), b.afraidOfAnimal_ref().value_unchecked());
  swap(a.vehicles_ref().value_unchecked(), b.vehicles_ref().value_unchecked());
  swap(a.__isset, b.__isset);
}

template void Person::readNoXfer<>(apache::thrift::BinaryProtocolReader*);
template uint32_t Person::write<>(apache::thrift::BinaryProtocolWriter*) const;
template uint32_t Person::serializedSize<>(apache::thrift::BinaryProtocolWriter const*) const;
template uint32_t Person::serializedSizeZC<>(apache::thrift::BinaryProtocolWriter const*) const;
template void Person::readNoXfer<>(apache::thrift::CompactProtocolReader*);
template uint32_t Person::write<>(apache::thrift::CompactProtocolWriter*) const;
template uint32_t Person::serializedSize<>(apache::thrift::CompactProtocolWriter const*) const;
template uint32_t Person::serializedSizeZC<>(apache::thrift::CompactProtocolWriter const*) const;

static_assert(
    ::apache::thrift::detail::st::gen_check_json<
        Person,
        ::apache::thrift::type_class::structure,
        ::cpp2::Color>,
    "inconsistent use of json option");
static_assert(
    ::apache::thrift::detail::st::gen_check_json<
        Person,
        ::apache::thrift::type_class::list<::apache::thrift::type_class::structure>,
        ::std::vector<::cpp2::Vehicle>>,
    "inconsistent use of json option");

static_assert(
    ::apache::thrift::detail::st::gen_check_nimble<
        Person,
        ::apache::thrift::type_class::structure,
        ::cpp2::Color>,
    "inconsistent use of nimble option");
static_assert(
    ::apache::thrift::detail::st::gen_check_nimble<
        Person,
        ::apache::thrift::type_class::list<::apache::thrift::type_class::structure>,
        ::std::vector<::cpp2::Vehicle>>,
    "inconsistent use of nimble option");

} // cpp2

namespace cpp2 { namespace {
FOLLY_MAYBE_UNUSED FOLLY_ERASE void validateAdapters() {
}
}} // cpp2
