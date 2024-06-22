// Code generated by protocol buffer compiler. Do not edit!
package emu.lunarcore.proto;

import java.io.IOException;
import us.hebi.quickbuf.FieldName;
import us.hebi.quickbuf.InvalidProtocolBufferException;
import us.hebi.quickbuf.JsonSink;
import us.hebi.quickbuf.JsonSource;
import us.hebi.quickbuf.MessageFactory;
import us.hebi.quickbuf.ProtoMessage;
import us.hebi.quickbuf.ProtoSink;
import us.hebi.quickbuf.ProtoSource;
import us.hebi.quickbuf.Utf8String;

public final class BattleOpOuterClass {
  /**
   * <pre>
   *  NOOKLEKBBAA
   * </pre>
   *
   * Protobuf type {@code BattleOp}
   */
  public static final class BattleOp extends ProtoMessage<BattleOp> implements Cloneable {
    private static final long serialVersionUID = 0L;

    /**
     * <pre>
     *  CDIJGFBOOAB
     * </pre>
     *
     * <code>optional uint32 turn_counter = 1;</code>
     */
    private int turnCounter;

    /**
     * <code>optional uint32 state = 2;</code>
     */
    private int state;

    /**
     * <pre>
     *  CLGDPDMKHGC
     * </pre>
     *
     * <code>optional uint32 action_entity_id = 3;</code>
     */
    private int actionEntityId;

    /**
     * <pre>
     *  GLIDOKAEJDO
     * </pre>
     *
     * <code>optional uint32 target_entity_id = 4;</code>
     */
    private int targetEntityId;

    /**
     * <pre>
     *  HLGDHAIHDJB
     * </pre>
     *
     * <code>optional uint32 op_type = 5;</code>
     */
    private int opType;

    /**
     * <pre>
     *  JJAIJFFIOCK
     * </pre>
     *
     * <code>optional uint32 skill_index = 6;</code>
     */
    private int skillIndex;

    /**
     * <pre>
     *  PPCJCFJFNBE
     * </pre>
     *
     * <code>optional uint32 operation_counter = 7;</code>
     */
    private int operationCounter;

    /**
     * <code>optional string OBCGHENJNLA = 8;</code>
     */
    private final Utf8String oBCGHENJNLA = Utf8String.newEmptyInstance();

    private BattleOp() {
    }

    /**
     * <pre>
     *  NOOKLEKBBAA
     * </pre>
     *
     * @return a new empty instance of {@code BattleOp}
     */
    public static BattleOp newInstance() {
      return new BattleOp();
    }

    /**
     * <pre>
     *  CDIJGFBOOAB
     * </pre>
     *
     * <code>optional uint32 turn_counter = 1;</code>
     * @return whether the turnCounter field is set
     */
    public boolean hasTurnCounter() {
      return (bitField0_ & 0x00000001) != 0;
    }

    /**
     * <pre>
     *  CDIJGFBOOAB
     * </pre>
     *
     * <code>optional uint32 turn_counter = 1;</code>
     * @return this
     */
    public BattleOp clearTurnCounter() {
      bitField0_ &= ~0x00000001;
      turnCounter = 0;
      return this;
    }

    /**
     * <pre>
     *  CDIJGFBOOAB
     * </pre>
     *
     * <code>optional uint32 turn_counter = 1;</code>
     * @return the turnCounter
     */
    public int getTurnCounter() {
      return turnCounter;
    }

    /**
     * <pre>
     *  CDIJGFBOOAB
     * </pre>
     *
     * <code>optional uint32 turn_counter = 1;</code>
     * @param value the turnCounter to set
     * @return this
     */
    public BattleOp setTurnCounter(final int value) {
      bitField0_ |= 0x00000001;
      turnCounter = value;
      return this;
    }

    /**
     * <code>optional uint32 state = 2;</code>
     * @return whether the state field is set
     */
    public boolean hasState() {
      return (bitField0_ & 0x00000002) != 0;
    }

    /**
     * <code>optional uint32 state = 2;</code>
     * @return this
     */
    public BattleOp clearState() {
      bitField0_ &= ~0x00000002;
      state = 0;
      return this;
    }

    /**
     * <code>optional uint32 state = 2;</code>
     * @return the state
     */
    public int getState() {
      return state;
    }

    /**
     * <code>optional uint32 state = 2;</code>
     * @param value the state to set
     * @return this
     */
    public BattleOp setState(final int value) {
      bitField0_ |= 0x00000002;
      state = value;
      return this;
    }

    /**
     * <pre>
     *  CLGDPDMKHGC
     * </pre>
     *
     * <code>optional uint32 action_entity_id = 3;</code>
     * @return whether the actionEntityId field is set
     */
    public boolean hasActionEntityId() {
      return (bitField0_ & 0x00000004) != 0;
    }

    /**
     * <pre>
     *  CLGDPDMKHGC
     * </pre>
     *
     * <code>optional uint32 action_entity_id = 3;</code>
     * @return this
     */
    public BattleOp clearActionEntityId() {
      bitField0_ &= ~0x00000004;
      actionEntityId = 0;
      return this;
    }

    /**
     * <pre>
     *  CLGDPDMKHGC
     * </pre>
     *
     * <code>optional uint32 action_entity_id = 3;</code>
     * @return the actionEntityId
     */
    public int getActionEntityId() {
      return actionEntityId;
    }

    /**
     * <pre>
     *  CLGDPDMKHGC
     * </pre>
     *
     * <code>optional uint32 action_entity_id = 3;</code>
     * @param value the actionEntityId to set
     * @return this
     */
    public BattleOp setActionEntityId(final int value) {
      bitField0_ |= 0x00000004;
      actionEntityId = value;
      return this;
    }

    /**
     * <pre>
     *  GLIDOKAEJDO
     * </pre>
     *
     * <code>optional uint32 target_entity_id = 4;</code>
     * @return whether the targetEntityId field is set
     */
    public boolean hasTargetEntityId() {
      return (bitField0_ & 0x00000008) != 0;
    }

    /**
     * <pre>
     *  GLIDOKAEJDO
     * </pre>
     *
     * <code>optional uint32 target_entity_id = 4;</code>
     * @return this
     */
    public BattleOp clearTargetEntityId() {
      bitField0_ &= ~0x00000008;
      targetEntityId = 0;
      return this;
    }

    /**
     * <pre>
     *  GLIDOKAEJDO
     * </pre>
     *
     * <code>optional uint32 target_entity_id = 4;</code>
     * @return the targetEntityId
     */
    public int getTargetEntityId() {
      return targetEntityId;
    }

    /**
     * <pre>
     *  GLIDOKAEJDO
     * </pre>
     *
     * <code>optional uint32 target_entity_id = 4;</code>
     * @param value the targetEntityId to set
     * @return this
     */
    public BattleOp setTargetEntityId(final int value) {
      bitField0_ |= 0x00000008;
      targetEntityId = value;
      return this;
    }

    /**
     * <pre>
     *  HLGDHAIHDJB
     * </pre>
     *
     * <code>optional uint32 op_type = 5;</code>
     * @return whether the opType field is set
     */
    public boolean hasOpType() {
      return (bitField0_ & 0x00000010) != 0;
    }

    /**
     * <pre>
     *  HLGDHAIHDJB
     * </pre>
     *
     * <code>optional uint32 op_type = 5;</code>
     * @return this
     */
    public BattleOp clearOpType() {
      bitField0_ &= ~0x00000010;
      opType = 0;
      return this;
    }

    /**
     * <pre>
     *  HLGDHAIHDJB
     * </pre>
     *
     * <code>optional uint32 op_type = 5;</code>
     * @return the opType
     */
    public int getOpType() {
      return opType;
    }

    /**
     * <pre>
     *  HLGDHAIHDJB
     * </pre>
     *
     * <code>optional uint32 op_type = 5;</code>
     * @param value the opType to set
     * @return this
     */
    public BattleOp setOpType(final int value) {
      bitField0_ |= 0x00000010;
      opType = value;
      return this;
    }

    /**
     * <pre>
     *  JJAIJFFIOCK
     * </pre>
     *
     * <code>optional uint32 skill_index = 6;</code>
     * @return whether the skillIndex field is set
     */
    public boolean hasSkillIndex() {
      return (bitField0_ & 0x00000020) != 0;
    }

    /**
     * <pre>
     *  JJAIJFFIOCK
     * </pre>
     *
     * <code>optional uint32 skill_index = 6;</code>
     * @return this
     */
    public BattleOp clearSkillIndex() {
      bitField0_ &= ~0x00000020;
      skillIndex = 0;
      return this;
    }

    /**
     * <pre>
     *  JJAIJFFIOCK
     * </pre>
     *
     * <code>optional uint32 skill_index = 6;</code>
     * @return the skillIndex
     */
    public int getSkillIndex() {
      return skillIndex;
    }

    /**
     * <pre>
     *  JJAIJFFIOCK
     * </pre>
     *
     * <code>optional uint32 skill_index = 6;</code>
     * @param value the skillIndex to set
     * @return this
     */
    public BattleOp setSkillIndex(final int value) {
      bitField0_ |= 0x00000020;
      skillIndex = value;
      return this;
    }

    /**
     * <pre>
     *  PPCJCFJFNBE
     * </pre>
     *
     * <code>optional uint32 operation_counter = 7;</code>
     * @return whether the operationCounter field is set
     */
    public boolean hasOperationCounter() {
      return (bitField0_ & 0x00000040) != 0;
    }

    /**
     * <pre>
     *  PPCJCFJFNBE
     * </pre>
     *
     * <code>optional uint32 operation_counter = 7;</code>
     * @return this
     */
    public BattleOp clearOperationCounter() {
      bitField0_ &= ~0x00000040;
      operationCounter = 0;
      return this;
    }

    /**
     * <pre>
     *  PPCJCFJFNBE
     * </pre>
     *
     * <code>optional uint32 operation_counter = 7;</code>
     * @return the operationCounter
     */
    public int getOperationCounter() {
      return operationCounter;
    }

    /**
     * <pre>
     *  PPCJCFJFNBE
     * </pre>
     *
     * <code>optional uint32 operation_counter = 7;</code>
     * @param value the operationCounter to set
     * @return this
     */
    public BattleOp setOperationCounter(final int value) {
      bitField0_ |= 0x00000040;
      operationCounter = value;
      return this;
    }

    /**
     * <code>optional string OBCGHENJNLA = 8;</code>
     * @return whether the oBCGHENJNLA field is set
     */
    public boolean hasOBCGHENJNLA() {
      return (bitField0_ & 0x00000080) != 0;
    }

    /**
     * <code>optional string OBCGHENJNLA = 8;</code>
     * @return this
     */
    public BattleOp clearOBCGHENJNLA() {
      bitField0_ &= ~0x00000080;
      oBCGHENJNLA.clear();
      return this;
    }

    /**
     * <code>optional string OBCGHENJNLA = 8;</code>
     * @return the oBCGHENJNLA
     */
    public String getOBCGHENJNLA() {
      return oBCGHENJNLA.getString();
    }

    /**
     * <code>optional string OBCGHENJNLA = 8;</code>
     * @return internal {@code Utf8String} representation of oBCGHENJNLA for reading
     */
    public Utf8String getOBCGHENJNLABytes() {
      return this.oBCGHENJNLA;
    }

    /**
     * <code>optional string OBCGHENJNLA = 8;</code>
     * @return internal {@code Utf8String} representation of oBCGHENJNLA for modifications
     */
    public Utf8String getMutableOBCGHENJNLABytes() {
      bitField0_ |= 0x00000080;
      return this.oBCGHENJNLA;
    }

    /**
     * <code>optional string OBCGHENJNLA = 8;</code>
     * @param value the oBCGHENJNLA to set
     * @return this
     */
    public BattleOp setOBCGHENJNLA(final CharSequence value) {
      bitField0_ |= 0x00000080;
      oBCGHENJNLA.copyFrom(value);
      return this;
    }

    /**
     * <code>optional string OBCGHENJNLA = 8;</code>
     * @param value the oBCGHENJNLA to set
     * @return this
     */
    public BattleOp setOBCGHENJNLA(final Utf8String value) {
      bitField0_ |= 0x00000080;
      oBCGHENJNLA.copyFrom(value);
      return this;
    }

    @Override
    public BattleOp copyFrom(final BattleOp other) {
      cachedSize = other.cachedSize;
      if ((bitField0_ | other.bitField0_) != 0) {
        bitField0_ = other.bitField0_;
        turnCounter = other.turnCounter;
        state = other.state;
        actionEntityId = other.actionEntityId;
        targetEntityId = other.targetEntityId;
        opType = other.opType;
        skillIndex = other.skillIndex;
        operationCounter = other.operationCounter;
        oBCGHENJNLA.copyFrom(other.oBCGHENJNLA);
      }
      return this;
    }

    @Override
    public BattleOp mergeFrom(final BattleOp other) {
      if (other.isEmpty()) {
        return this;
      }
      cachedSize = -1;
      if (other.hasTurnCounter()) {
        setTurnCounter(other.turnCounter);
      }
      if (other.hasState()) {
        setState(other.state);
      }
      if (other.hasActionEntityId()) {
        setActionEntityId(other.actionEntityId);
      }
      if (other.hasTargetEntityId()) {
        setTargetEntityId(other.targetEntityId);
      }
      if (other.hasOpType()) {
        setOpType(other.opType);
      }
      if (other.hasSkillIndex()) {
        setSkillIndex(other.skillIndex);
      }
      if (other.hasOperationCounter()) {
        setOperationCounter(other.operationCounter);
      }
      if (other.hasOBCGHENJNLA()) {
        getMutableOBCGHENJNLABytes().copyFrom(other.oBCGHENJNLA);
      }
      return this;
    }

    @Override
    public BattleOp clear() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      turnCounter = 0;
      state = 0;
      actionEntityId = 0;
      targetEntityId = 0;
      opType = 0;
      skillIndex = 0;
      operationCounter = 0;
      oBCGHENJNLA.clear();
      return this;
    }

    @Override
    public BattleOp clearQuick() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      oBCGHENJNLA.clear();
      return this;
    }

    @Override
    public boolean equals(Object o) {
      if (o == this) {
        return true;
      }
      if (!(o instanceof BattleOp)) {
        return false;
      }
      BattleOp other = (BattleOp) o;
      return bitField0_ == other.bitField0_
        && (!hasTurnCounter() || turnCounter == other.turnCounter)
        && (!hasState() || state == other.state)
        && (!hasActionEntityId() || actionEntityId == other.actionEntityId)
        && (!hasTargetEntityId() || targetEntityId == other.targetEntityId)
        && (!hasOpType() || opType == other.opType)
        && (!hasSkillIndex() || skillIndex == other.skillIndex)
        && (!hasOperationCounter() || operationCounter == other.operationCounter)
        && (!hasOBCGHENJNLA() || oBCGHENJNLA.equals(other.oBCGHENJNLA));
    }

    @Override
    public void writeTo(final ProtoSink output) throws IOException {
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeRawByte((byte) 8);
        output.writeUInt32NoTag(turnCounter);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeRawByte((byte) 16);
        output.writeUInt32NoTag(state);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        output.writeRawByte((byte) 24);
        output.writeUInt32NoTag(actionEntityId);
      }
      if ((bitField0_ & 0x00000008) != 0) {
        output.writeRawByte((byte) 32);
        output.writeUInt32NoTag(targetEntityId);
      }
      if ((bitField0_ & 0x00000010) != 0) {
        output.writeRawByte((byte) 40);
        output.writeUInt32NoTag(opType);
      }
      if ((bitField0_ & 0x00000020) != 0) {
        output.writeRawByte((byte) 48);
        output.writeUInt32NoTag(skillIndex);
      }
      if ((bitField0_ & 0x00000040) != 0) {
        output.writeRawByte((byte) 56);
        output.writeUInt32NoTag(operationCounter);
      }
      if ((bitField0_ & 0x00000080) != 0) {
        output.writeRawByte((byte) 66);
        output.writeStringNoTag(oBCGHENJNLA);
      }
    }

    @Override
    protected int computeSerializedSize() {
      int size = 0;
      if ((bitField0_ & 0x00000001) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(turnCounter);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(state);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(actionEntityId);
      }
      if ((bitField0_ & 0x00000008) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(targetEntityId);
      }
      if ((bitField0_ & 0x00000010) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(opType);
      }
      if ((bitField0_ & 0x00000020) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(skillIndex);
      }
      if ((bitField0_ & 0x00000040) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(operationCounter);
      }
      if ((bitField0_ & 0x00000080) != 0) {
        size += 1 + ProtoSink.computeStringSizeNoTag(oBCGHENJNLA);
      }
      return size;
    }

    @Override
    @SuppressWarnings("fallthrough")
    public BattleOp mergeFrom(final ProtoSource input) throws IOException {
      // Enabled Fall-Through Optimization (QuickBuffers)
      int tag = input.readTag();
      while (true) {
        switch (tag) {
          case 8: {
            // turnCounter
            turnCounter = input.readUInt32();
            bitField0_ |= 0x00000001;
            tag = input.readTag();
            if (tag != 16) {
              break;
            }
          }
          case 16: {
            // state
            state = input.readUInt32();
            bitField0_ |= 0x00000002;
            tag = input.readTag();
            if (tag != 24) {
              break;
            }
          }
          case 24: {
            // actionEntityId
            actionEntityId = input.readUInt32();
            bitField0_ |= 0x00000004;
            tag = input.readTag();
            if (tag != 32) {
              break;
            }
          }
          case 32: {
            // targetEntityId
            targetEntityId = input.readUInt32();
            bitField0_ |= 0x00000008;
            tag = input.readTag();
            if (tag != 40) {
              break;
            }
          }
          case 40: {
            // opType
            opType = input.readUInt32();
            bitField0_ |= 0x00000010;
            tag = input.readTag();
            if (tag != 48) {
              break;
            }
          }
          case 48: {
            // skillIndex
            skillIndex = input.readUInt32();
            bitField0_ |= 0x00000020;
            tag = input.readTag();
            if (tag != 56) {
              break;
            }
          }
          case 56: {
            // operationCounter
            operationCounter = input.readUInt32();
            bitField0_ |= 0x00000040;
            tag = input.readTag();
            if (tag != 66) {
              break;
            }
          }
          case 66: {
            // oBCGHENJNLA
            input.readString(oBCGHENJNLA);
            bitField0_ |= 0x00000080;
            tag = input.readTag();
            if (tag != 0) {
              break;
            }
          }
          case 0: {
            return this;
          }
          default: {
            if (!input.skipField(tag)) {
              return this;
            }
            tag = input.readTag();
            break;
          }
        }
      }
    }

    @Override
    public void writeTo(final JsonSink output) throws IOException {
      output.beginObject();
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeUInt32(FieldNames.turnCounter, turnCounter);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeUInt32(FieldNames.state, state);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        output.writeUInt32(FieldNames.actionEntityId, actionEntityId);
      }
      if ((bitField0_ & 0x00000008) != 0) {
        output.writeUInt32(FieldNames.targetEntityId, targetEntityId);
      }
      if ((bitField0_ & 0x00000010) != 0) {
        output.writeUInt32(FieldNames.opType, opType);
      }
      if ((bitField0_ & 0x00000020) != 0) {
        output.writeUInt32(FieldNames.skillIndex, skillIndex);
      }
      if ((bitField0_ & 0x00000040) != 0) {
        output.writeUInt32(FieldNames.operationCounter, operationCounter);
      }
      if ((bitField0_ & 0x00000080) != 0) {
        output.writeString(FieldNames.oBCGHENJNLA, oBCGHENJNLA);
      }
      output.endObject();
    }

    @Override
    public BattleOp mergeFrom(final JsonSource input) throws IOException {
      if (!input.beginObject()) {
        return this;
      }
      while (!input.isAtEnd()) {
        switch (input.readFieldHash()) {
          case 1656510143:
          case -859328454: {
            if (input.isAtField(FieldNames.turnCounter)) {
              if (!input.trySkipNullValue()) {
                turnCounter = input.readUInt32();
                bitField0_ |= 0x00000001;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case 109757585: {
            if (input.isAtField(FieldNames.state)) {
              if (!input.trySkipNullValue()) {
                state = input.readUInt32();
                bitField0_ |= 0x00000002;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case -2016424780:
          case 801410094: {
            if (input.isAtField(FieldNames.actionEntityId)) {
              if (!input.trySkipNullValue()) {
                actionEntityId = input.readUInt32();
                bitField0_ |= 0x00000004;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case 600782095:
          case -913618487: {
            if (input.isAtField(FieldNames.targetEntityId)) {
              if (!input.trySkipNullValue()) {
                targetEntityId = input.readUInt32();
                bitField0_ |= 0x00000008;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case -1011074885:
          case -1268531496: {
            if (input.isAtField(FieldNames.opType)) {
              if (!input.trySkipNullValue()) {
                opType = input.readUInt32();
                bitField0_ |= 0x00000010;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case 1587034369:
          case -1716021916: {
            if (input.isAtField(FieldNames.skillIndex)) {
              if (!input.trySkipNullValue()) {
                skillIndex = input.readUInt32();
                bitField0_ |= 0x00000020;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case -1914403179:
          case 111508260: {
            if (input.isAtField(FieldNames.operationCounter)) {
              if (!input.trySkipNullValue()) {
                operationCounter = input.readUInt32();
                bitField0_ |= 0x00000040;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case -439625005: {
            if (input.isAtField(FieldNames.oBCGHENJNLA)) {
              if (!input.trySkipNullValue()) {
                input.readString(oBCGHENJNLA);
                bitField0_ |= 0x00000080;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          default: {
            input.skipUnknownField();
            break;
          }
        }
      }
      input.endObject();
      return this;
    }

    @Override
    public BattleOp clone() {
      return new BattleOp().copyFrom(this);
    }

    @Override
    public boolean isEmpty() {
      return ((bitField0_) == 0);
    }

    public static BattleOp parseFrom(final byte[] data) throws InvalidProtocolBufferException {
      return ProtoMessage.mergeFrom(new BattleOp(), data).checkInitialized();
    }

    public static BattleOp parseFrom(final ProtoSource input) throws IOException {
      return ProtoMessage.mergeFrom(new BattleOp(), input).checkInitialized();
    }

    public static BattleOp parseFrom(final JsonSource input) throws IOException {
      return ProtoMessage.mergeFrom(new BattleOp(), input).checkInitialized();
    }

    /**
     * @return factory for creating BattleOp messages
     */
    public static MessageFactory<BattleOp> getFactory() {
      return BattleOpFactory.INSTANCE;
    }

    private enum BattleOpFactory implements MessageFactory<BattleOp> {
      INSTANCE;

      @Override
      public BattleOp create() {
        return BattleOp.newInstance();
      }
    }

    /**
     * Contains name constants used for serializing JSON
     */
    static class FieldNames {
      static final FieldName turnCounter = FieldName.forField("turnCounter", "turn_counter");

      static final FieldName state = FieldName.forField("state");

      static final FieldName actionEntityId = FieldName.forField("actionEntityId", "action_entity_id");

      static final FieldName targetEntityId = FieldName.forField("targetEntityId", "target_entity_id");

      static final FieldName opType = FieldName.forField("opType", "op_type");

      static final FieldName skillIndex = FieldName.forField("skillIndex", "skill_index");

      static final FieldName operationCounter = FieldName.forField("operationCounter", "operation_counter");

      static final FieldName oBCGHENJNLA = FieldName.forField("OBCGHENJNLA");
    }
  }
}
