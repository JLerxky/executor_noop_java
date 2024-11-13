#!/bin/bash

git submodule deinit --all -f && \
./gradlew clean && \
git submodule update --force --init --remote --recursive && \
rm -rf proto/protos/health_check.proto
