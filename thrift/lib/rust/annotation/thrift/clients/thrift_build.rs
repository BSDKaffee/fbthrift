// @generated by autocargo

use std::env;
use std::fs;
use std::path::Path;
use thrift_compiler::Config;
use thrift_compiler::GenContext;
const CRATEMAP: &str = "\
scope scope //thrift/annotation:scope-rust
thrift crate //thrift/annotation:thrift-rust
";
#[rustfmt::skip]
fn main() {
    println!("cargo:rerun-if-changed=thrift_build.rs");
    let out_dir = env::var_os("OUT_DIR").expect("OUT_DIR env not provided");
    let cratemap_path = Path::new(&out_dir).join("cratemap");
    fs::write(cratemap_path, CRATEMAP).expect("Failed to write cratemap");
    let mut conf = Config::from_env(GenContext::Clients)
        .expect("Failed to instantiate thrift_compiler::Config");
    let cargo_manifest_dir = env::var_os("CARGO_MANIFEST_DIR")
        .expect("CARGO_MANIFEST_DIR not provided");
    let mut base_path = Path::new(&cargo_manifest_dir)
        .join("../../../../../..")
        .canonicalize()
        .expect("Failed to canonicalize base_path");
    if cfg!(windows) {
        base_path = base_path.to_string_lossy().trim_start_matches(r"\\?\").into();
    }
    conf.base_path(base_path);
    conf.types_crate("thrift__types");
    conf.clients_crate("thrift__clients");
    let srcs = &["../../../../../annotation/thrift.thrift"];
    conf.run(srcs).expect("Failed while running thrift compilation");
}
