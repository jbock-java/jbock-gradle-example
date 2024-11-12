#!/usr/bin/env bash
java --module-path $(./get_module_path) --module jbock.gradle.example/net.jbock.cp.CopyFile $@
