#!/bin/bash

./gradlew build -Dquarkus.native.enabled=true -Dquarkus.native.container-build=true -x test && \
docker build -f src/main/docker/Dockerfile.native-micro -t cita-cloud/executor_noop_java .
