package com.arraywork.springshot;

import java.io.Serializable;

import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.hibernate.id.IdentifierGenerator;

import com.arraywork.springshot.util.Digest;

/**
 * NanoId Generator
 * @author AiChen
 * @copyright ArrayWork Inc.
 * @created 2024/02/26
 */
public class NanoIdGenerator implements IdentifierGenerator {

    private static final long serialVersionUID = -6862333156340587235L;

    @Override
    public Serializable generate(SharedSessionContractImplementor session, Object obj) {
        return Digest.nanoId();
    }

}