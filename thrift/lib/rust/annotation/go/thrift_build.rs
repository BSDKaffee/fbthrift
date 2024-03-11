// @generated by autocargo
use std::env;
use std::fs;
use std::path::Path;

use thrift_compiler::Config;
use thrift_compiler::GenContext;

#[rustfmt::skip]
fn main() {
    // Rerun if this gets rewritten.
    println!("cargo:rerun-if-changed=thrift_build.rs");

    let out_dir = env::var_os("OUT_DIR").expect("OUT_DIR env not provided");
    let out_dir: &Path = out_dir.as_ref();
    fs::write(
        out_dir.join("cratemap"),
        "go crate //thrift/annotation:go-rust
scope scope //thrift/annotation:scope-rust",
    ).expect("Failed to write cratemap");

    let conf = {
        let mut conf = Config::from_env(GenContext::Types).expect("Failed to instantiate thrift_compiler::Config");

        let path_from_manifest_to_base: &Path = "../../../../..".as_ref();
        let cargo_manifest_dir =
            env::var_os("CARGO_MANIFEST_DIR").expect("CARGO_MANIFEST_DIR not provided");
        let cargo_manifest_dir: &Path = cargo_manifest_dir.as_ref();
        let base_path = cargo_manifest_dir
            .join(path_from_manifest_to_base)
            .canonicalize()
            .expect("Failed to canonicalize base_path");
        // TODO: replace canonicalize() with std::path::absolute() when
        // https://github.com/rust-lang/rust/pull/91673 is available (~Rust 1.60)
        // and remove this block.
        #[cfg(windows)]
        let base_path = Path::new(
            base_path
                .as_path()
                .to_string_lossy()
                .trim_start_matches(r"\\?\"),
            )
            .to_path_buf();

        conf.base_path(base_path);

        conf.types_crate("go__types");
        conf.clients_crate("go__clients");
        conf.services_crate("go__services");

        let options = "";
        if !options.is_empty() {
            conf.options(options);
        }

        let types_include_srcs = vec![
            
        ];
        conf.types_include_srcs(types_include_srcs);

        conf
    };

    let srcs: &[&str] = &[
        "../../../../annotation/go.thrift"
    ];
    conf.run(srcs).expect("Failed while running thrift compilation");
}
