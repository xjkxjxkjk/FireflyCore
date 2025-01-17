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

public final class EnterFeverTimeActivityStageScRspOuterClass {
  /**
   * Protobuf type {@code EnterFeverTimeActivityStageScRsp}
   */
  public static final class EnterFeverTimeActivityStageScRsp extends ProtoMessage<EnterFeverTimeActivityStageScRsp> implements Cloneable {
    private static final long serialVersionUID = 0L;

    /**
     * <code>optional uint32 id = 3;</code>
     */
    private int id;

    /**
     * <code>optional uint32 retcode = 11;</code>
     */
    private int retcode;

    /**
     * <code>optional .SceneBattleInfo battle_info = 2;</code>
     */
    private final SceneBattleInfoOuterClass.SceneBattleInfo battleInfo = SceneBattleInfoOuterClass.SceneBattleInfo.newInstance();

    private EnterFeverTimeActivityStageScRsp() {
    }

    /**
     * @return a new empty instance of {@code EnterFeverTimeActivityStageScRsp}
     */
    public static EnterFeverTimeActivityStageScRsp newInstance() {
      return new EnterFeverTimeActivityStageScRsp();
    }

    /**
     * <code>optional uint32 id = 3;</code>
     * @return whether the id field is set
     */
    public boolean hasId() {
      return (bitField0_ & 0x00000001) != 0;
    }

    /**
     * <code>optional uint32 id = 3;</code>
     * @return this
     */
    public EnterFeverTimeActivityStageScRsp clearId() {
      bitField0_ &= ~0x00000001;
      id = 0;
      return this;
    }

    /**
     * <code>optional uint32 id = 3;</code>
     * @return the id
     */
    public int getId() {
      return id;
    }

    /**
     * <code>optional uint32 id = 3;</code>
     * @param value the id to set
     * @return this
     */
    public EnterFeverTimeActivityStageScRsp setId(final int value) {
      bitField0_ |= 0x00000001;
      id = value;
      return this;
    }

    /**
     * <code>optional uint32 retcode = 11;</code>
     * @return whether the retcode field is set
     */
    public boolean hasRetcode() {
      return (bitField0_ & 0x00000002) != 0;
    }

    /**
     * <code>optional uint32 retcode = 11;</code>
     * @return this
     */
    public EnterFeverTimeActivityStageScRsp clearRetcode() {
      bitField0_ &= ~0x00000002;
      retcode = 0;
      return this;
    }

    /**
     * <code>optional uint32 retcode = 11;</code>
     * @return the retcode
     */
    public int getRetcode() {
      return retcode;
    }

    /**
     * <code>optional uint32 retcode = 11;</code>
     * @param value the retcode to set
     * @return this
     */
    public EnterFeverTimeActivityStageScRsp setRetcode(final int value) {
      bitField0_ |= 0x00000002;
      retcode = value;
      return this;
    }

    /**
     * <code>optional .SceneBattleInfo battle_info = 2;</code>
     * @return whether the battleInfo field is set
     */
    public boolean hasBattleInfo() {
      return (bitField0_ & 0x00000004) != 0;
    }

    /**
     * <code>optional .SceneBattleInfo battle_info = 2;</code>
     * @return this
     */
    public EnterFeverTimeActivityStageScRsp clearBattleInfo() {
      bitField0_ &= ~0x00000004;
      battleInfo.clear();
      return this;
    }

    /**
     * <code>optional .SceneBattleInfo battle_info = 2;</code>
     *
     * This method returns the internal storage object without modifying any has state.
     * The returned object should not be modified and be treated as read-only.
     *
     * Use {@link #getMutableBattleInfo()} if you want to modify it.
     *
     * @return internal storage object for reading
     */
    public SceneBattleInfoOuterClass.SceneBattleInfo getBattleInfo() {
      return battleInfo;
    }

    /**
     * <code>optional .SceneBattleInfo battle_info = 2;</code>
     *
     * This method returns the internal storage object and sets the corresponding
     * has state. The returned object will become part of this message and its
     * contents may be modified as long as the has state is not cleared.
     *
     * @return internal storage object for modifications
     */
    public SceneBattleInfoOuterClass.SceneBattleInfo getMutableBattleInfo() {
      bitField0_ |= 0x00000004;
      return battleInfo;
    }

    /**
     * <code>optional .SceneBattleInfo battle_info = 2;</code>
     * @param value the battleInfo to set
     * @return this
     */
    public EnterFeverTimeActivityStageScRsp setBattleInfo(
        final SceneBattleInfoOuterClass.SceneBattleInfo value) {
      bitField0_ |= 0x00000004;
      battleInfo.copyFrom(value);
      return this;
    }

    @Override
    public EnterFeverTimeActivityStageScRsp copyFrom(final EnterFeverTimeActivityStageScRsp other) {
      cachedSize = other.cachedSize;
      if ((bitField0_ | other.bitField0_) != 0) {
        bitField0_ = other.bitField0_;
        id = other.id;
        retcode = other.retcode;
        battleInfo.copyFrom(other.battleInfo);
      }
      return this;
    }

    @Override
    public EnterFeverTimeActivityStageScRsp mergeFrom(
        final EnterFeverTimeActivityStageScRsp other) {
      if (other.isEmpty()) {
        return this;
      }
      cachedSize = -1;
      if (other.hasId()) {
        setId(other.id);
      }
      if (other.hasRetcode()) {
        setRetcode(other.retcode);
      }
      if (other.hasBattleInfo()) {
        getMutableBattleInfo().mergeFrom(other.battleInfo);
      }
      return this;
    }

    @Override
    public EnterFeverTimeActivityStageScRsp clear() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      id = 0;
      retcode = 0;
      battleInfo.clear();
      return this;
    }

    @Override
    public EnterFeverTimeActivityStageScRsp clearQuick() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      battleInfo.clearQuick();
      return this;
    }

    @Override
    public boolean equals(Object o) {
      if (o == this) {
        return true;
      }
      if (!(o instanceof EnterFeverTimeActivityStageScRsp)) {
        return false;
      }
      EnterFeverTimeActivityStageScRsp other = (EnterFeverTimeActivityStageScRsp) o;
      return bitField0_ == other.bitField0_
        && (!hasId() || id == other.id)
        && (!hasRetcode() || retcode == other.retcode)
        && (!hasBattleInfo() || battleInfo.equals(other.battleInfo));
    }

    @Override
    public void writeTo(final ProtoSink output) throws IOException {
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeRawByte((byte) 24);
        output.writeUInt32NoTag(id);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeRawByte((byte) 88);
        output.writeUInt32NoTag(retcode);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        output.writeRawByte((byte) 18);
        output.writeMessageNoTag(battleInfo);
      }
    }

    @Override
    protected int computeSerializedSize() {
      int size = 0;
      if ((bitField0_ & 0x00000001) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(id);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(retcode);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        size += 1 + ProtoSink.computeMessageSizeNoTag(battleInfo);
      }
      return size;
    }

    @Override
    @SuppressWarnings("fallthrough")
    public EnterFeverTimeActivityStageScRsp mergeFrom(final ProtoSource input) throws IOException {
      // Enabled Fall-Through Optimization (QuickBuffers)
      int tag = input.readTag();
      while (true) {
        switch (tag) {
          case 24: {
            // id
            id = input.readUInt32();
            bitField0_ |= 0x00000001;
            tag = input.readTag();
            if (tag != 88) {
              break;
            }
          }
          case 88: {
            // retcode
            retcode = input.readUInt32();
            bitField0_ |= 0x00000002;
            tag = input.readTag();
            if (tag != 18) {
              break;
            }
          }
          case 18: {
            // battleInfo
            input.readMessage(battleInfo);
            bitField0_ |= 0x00000004;
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
        output.writeUInt32(FieldNames.id, id);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeUInt32(FieldNames.retcode, retcode);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        output.writeMessage(FieldNames.battleInfo, battleInfo);
      }
      output.endObject();
    }

    @Override
    public EnterFeverTimeActivityStageScRsp mergeFrom(final JsonSource input) throws IOException {
      if (!input.beginObject()) {
        return this;
      }
      while (!input.isAtEnd()) {
        switch (input.readFieldHash()) {
          case 3355: {
            if (input.isAtField(FieldNames.id)) {
              if (!input.trySkipNullValue()) {
                id = input.readUInt32();
                bitField0_ |= 0x00000001;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case 1097936398: {
            if (input.isAtField(FieldNames.retcode)) {
              if (!input.trySkipNullValue()) {
                retcode = input.readUInt32();
                bitField0_ |= 0x00000002;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case 2053377414:
          case -749633579: {
            if (input.isAtField(FieldNames.battleInfo)) {
              if (!input.trySkipNullValue()) {
                input.readMessage(battleInfo);
                bitField0_ |= 0x00000004;
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
    public EnterFeverTimeActivityStageScRsp clone() {
      return new EnterFeverTimeActivityStageScRsp().copyFrom(this);
    }

    @Override
    public boolean isEmpty() {
      return ((bitField0_) == 0);
    }

    public static EnterFeverTimeActivityStageScRsp parseFrom(final byte[] data) throws
        InvalidProtocolBufferException {
      return ProtoMessage.mergeFrom(new EnterFeverTimeActivityStageScRsp(), data).checkInitialized();
    }

    public static EnterFeverTimeActivityStageScRsp parseFrom(final ProtoSource input) throws
        IOException {
      return ProtoMessage.mergeFrom(new EnterFeverTimeActivityStageScRsp(), input).checkInitialized();
    }

    public static EnterFeverTimeActivityStageScRsp parseFrom(final JsonSource input) throws
        IOException {
      return ProtoMessage.mergeFrom(new EnterFeverTimeActivityStageScRsp(), input).checkInitialized();
    }

    /**
     * @return factory for creating EnterFeverTimeActivityStageScRsp messages
     */
    public static MessageFactory<EnterFeverTimeActivityStageScRsp> getFactory() {
      return EnterFeverTimeActivityStageScRspFactory.INSTANCE;
    }

    private enum EnterFeverTimeActivityStageScRspFactory implements MessageFactory<EnterFeverTimeActivityStageScRsp> {
      INSTANCE;

      @Override
      public EnterFeverTimeActivityStageScRsp create() {
        return EnterFeverTimeActivityStageScRsp.newInstance();
      }
    }

    /**
     * Contains name constants used for serializing JSON
     */
    static class FieldNames {
      static final FieldName id = FieldName.forField("id");

      static final FieldName retcode = FieldName.forField("retcode");

      static final FieldName battleInfo = FieldName.forField("battleInfo", "battle_info");
    }
  }
}
