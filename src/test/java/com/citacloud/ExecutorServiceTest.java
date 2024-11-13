package com.citacloud;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.Duration;

import io.quarkus.grpc.GrpcClient;
import io.quarkus.test.junit.QuarkusTest;

import org.junit.jupiter.api.Test;

import com.google.protobuf.ByteString;

import blockchain.Blockchain;
import common.Common.Hash;
import common.Common.HashResponse;
import executor.Executor.CallRequest;
import executor.Executor.CallResponse;
import executor.ExecutorService;

@QuarkusTest
class ExecutorServiceTest {
    @GrpcClient
    ExecutorService executorService;

    @Test
    void testExec() {
        HashResponse reply = executorService.exec(Blockchain.Block.newBuilder().build()).await()
                .atMost(Duration.ofSeconds(5));
        assertEquals(Hash.newBuilder().build(), reply.getHash());
    }

    @Test
    void testCall() {
        CallResponse reply = executorService.call(CallRequest.newBuilder().build()).await()
                .atMost(Duration.ofSeconds(5));
        assertEquals(ByteString.EMPTY, reply.getValue());
    }

}
