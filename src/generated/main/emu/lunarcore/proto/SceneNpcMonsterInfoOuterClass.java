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

public final class SceneNpcMonsterInfoOuterClass {
  /**
   * Protobuf type {@code SceneNpcMonsterInfo}
   */
  public static final class SceneNpcMonsterInfo extends ProtoMessage<SceneNpcMonsterInfo> implements Cloneable {
    private static final long serialVersionUID = 0L;

    /**
     * <code>optional uint32 scene_event_id = 1;</code>
     */
    private int sceneEventId;

    /**
     * <pre>
     * INGKKPMDGFJ extra_info = 2;
     * </pre>
     *
     * <code>optional uint32 world_level = 10;</code>
     */
    private int worldLevel;

    /**
     * <code>optional uint32 monster_id = 12;</code>
     */
    private int monsterId;

    /**
     * <code>optional bool MNGIHHFBPLO = 3;</code>
     */
    private boolean mNGIHHFBPLO;

    /**
     * <code>optional bool AHNAIBGMCDB = 11;</code>
     */
    private boolean aHNAIBGMCDB;

    private SceneNpcMonsterInfo() {
    }

    /**
     * @return a new empty instance of {@code SceneNpcMonsterInfo}
     */
    public static SceneNpcMonsterInfo newInstance() {
      return new SceneNpcMonsterInfo();
    }

    /**
     * <code>optional uint32 scene_event_id = 1;</code>
     * @return whether the sceneEventId field is set
     */
    public boolean hasSceneEventId() {
      return (bitField0_ & 0x00000001) != 0;
    }

    /**
     * <code>optional uint32 scene_event_id = 1;</code>
     * @return this
     */
    public SceneNpcMonsterInfo clearSceneEventId() {
      bitField0_ &= ~0x00000001;
      sceneEventId = 0;
      return this;
    }

    /**
     * <code>optional uint32 scene_event_id = 1;</code>
     * @return the sceneEventId
     */
    public int getSceneEventId() {
      return sceneEventId;
    }

    /**
     * <code>optional uint32 scene_event_id = 1;</code>
     * @param value the sceneEventId to set
     * @return this
     */
    public SceneNpcMonsterInfo setSceneEventId(final int value) {
      bitField0_ |= 0x00000001;
      sceneEventId = value;
      return this;
    }

    /**
     * <pre>
     * INGKKPMDGFJ extra_info = 2;
     * </pre>
     *
     * <code>optional uint32 world_level = 10;</code>
     * @return whether the worldLevel field is set
     */
    public boolean hasWorldLevel() {
      return (bitField0_ & 0x00000002) != 0;
    }

    /**
     * <pre>
     * INGKKPMDGFJ extra_info = 2;
     * </pre>
     *
     * <code>optional uint32 world_level = 10;</code>
     * @return this
     */
    public SceneNpcMonsterInfo clearWorldLevel() {
      bitField0_ &= ~0x00000002;
      worldLevel = 0;
      return this;
    }

    /**
     * <pre>
     * INGKKPMDGFJ extra_info = 2;
     * </pre>
     *
     * <code>optional uint32 world_level = 10;</code>
     * @return the worldLevel
     */
    public int getWorldLevel() {
      return worldLevel;
    }

    /**
     * <pre>
     * INGKKPMDGFJ extra_info = 2;
     * </pre>
     *
     * <code>optional uint32 world_level = 10;</code>
     * @param value the worldLevel to set
     * @return this
     */
    public SceneNpcMonsterInfo setWorldLevel(final int value) {
      bitField0_ |= 0x00000002;
      worldLevel = value;
      return this;
    }

    /**
     * <code>optional uint32 monster_id = 12;</code>
     * @return whether the monsterId field is set
     */
    public boolean hasMonsterId() {
      return (bitField0_ & 0x00000004) != 0;
    }

    /**
     * <code>optional uint32 monster_id = 12;</code>
     * @return this
     */
    public SceneNpcMonsterInfo clearMonsterId() {
      bitField0_ &= ~0x00000004;
      monsterId = 0;
      return this;
    }

    /**
     * <code>optional uint32 monster_id = 12;</code>
     * @return the monsterId
     */
    public int getMonsterId() {
      return monsterId;
    }

    /**
     * <code>optional uint32 monster_id = 12;</code>
     * @param value the monsterId to set
     * @return this
     */
    public SceneNpcMonsterInfo setMonsterId(final int value) {
      bitField0_ |= 0x00000004;
      monsterId = value;
      return this;
    }

    /**
     * <code>optional bool MNGIHHFBPLO = 3;</code>
     * @return whether the mNGIHHFBPLO field is set
     */
    public boolean hasMNGIHHFBPLO() {
      return (bitField0_ & 0x00000008) != 0;
    }

    /**
     * <code>optional bool MNGIHHFBPLO = 3;</code>
     * @return this
     */
    public SceneNpcMonsterInfo clearMNGIHHFBPLO() {
      bitField0_ &= ~0x00000008;
      mNGIHHFBPLO = false;
      return this;
    }

    /**
     * <code>optional bool MNGIHHFBPLO = 3;</code>
     * @return the mNGIHHFBPLO
     */
    public boolean getMNGIHHFBPLO() {
      return mNGIHHFBPLO;
    }

    /**
     * <code>optional bool MNGIHHFBPLO = 3;</code>
     * @param value the mNGIHHFBPLO to set
     * @return this
     */
    public SceneNpcMonsterInfo setMNGIHHFBPLO(final boolean value) {
      bitField0_ |= 0x00000008;
      mNGIHHFBPLO = value;
      return this;
    }

    /**
     * <code>optional bool AHNAIBGMCDB = 11;</code>
     * @return whether the aHNAIBGMCDB field is set
     */
    public boolean hasAHNAIBGMCDB() {
      return (bitField0_ & 0x00000010) != 0;
    }

    /**
     * <code>optional bool AHNAIBGMCDB = 11;</code>
     * @return this
     */
    public SceneNpcMonsterInfo clearAHNAIBGMCDB() {
      bitField0_ &= ~0x00000010;
      aHNAIBGMCDB = false;
      return this;
    }

    /**
     * <code>optional bool AHNAIBGMCDB = 11;</code>
     * @return the aHNAIBGMCDB
     */
    public boolean getAHNAIBGMCDB() {
      return aHNAIBGMCDB;
    }

    /**
     * <code>optional bool AHNAIBGMCDB = 11;</code>
     * @param value the aHNAIBGMCDB to set
     * @return this
     */
    public SceneNpcMonsterInfo setAHNAIBGMCDB(final boolean value) {
      bitField0_ |= 0x00000010;
      aHNAIBGMCDB = value;
      return this;
    }

    @Override
    public SceneNpcMonsterInfo copyFrom(final SceneNpcMonsterInfo other) {
      cachedSize = other.cachedSize;
      if ((bitField0_ | other.bitField0_) != 0) {
        bitField0_ = other.bitField0_;
        sceneEventId = other.sceneEventId;
        worldLevel = other.worldLevel;
        monsterId = other.monsterId;
        mNGIHHFBPLO = other.mNGIHHFBPLO;
        aHNAIBGMCDB = other.aHNAIBGMCDB;
      }
      return this;
    }

    @Override
    public SceneNpcMonsterInfo mergeFrom(final SceneNpcMonsterInfo other) {
      if (other.isEmpty()) {
        return this;
      }
      cachedSize = -1;
      if (other.hasSceneEventId()) {
        setSceneEventId(other.sceneEventId);
      }
      if (other.hasWorldLevel()) {
        setWorldLevel(other.worldLevel);
      }
      if (other.hasMonsterId()) {
        setMonsterId(other.monsterId);
      }
      if (other.hasMNGIHHFBPLO()) {
        setMNGIHHFBPLO(other.mNGIHHFBPLO);
      }
      if (other.hasAHNAIBGMCDB()) {
        setAHNAIBGMCDB(other.aHNAIBGMCDB);
      }
      return this;
    }

    @Override
    public SceneNpcMonsterInfo clear() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      sceneEventId = 0;
      worldLevel = 0;
      monsterId = 0;
      mNGIHHFBPLO = false;
      aHNAIBGMCDB = false;
      return this;
    }

    @Override
    public SceneNpcMonsterInfo clearQuick() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      return this;
    }

    @Override
    public boolean equals(Object o) {
      if (o == this) {
        return true;
      }
      if (!(o instanceof SceneNpcMonsterInfo)) {
        return false;
      }
      SceneNpcMonsterInfo other = (SceneNpcMonsterInfo) o;
      return bitField0_ == other.bitField0_
        && (!hasSceneEventId() || sceneEventId == other.sceneEventId)
        && (!hasWorldLevel() || worldLevel == other.worldLevel)
        && (!hasMonsterId() || monsterId == other.monsterId)
        && (!hasMNGIHHFBPLO() || mNGIHHFBPLO == other.mNGIHHFBPLO)
        && (!hasAHNAIBGMCDB() || aHNAIBGMCDB == other.aHNAIBGMCDB);
    }

    @Override
    public void writeTo(final ProtoSink output) throws IOException {
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeRawByte((byte) 8);
        output.writeUInt32NoTag(sceneEventId);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeRawByte((byte) 80);
        output.writeUInt32NoTag(worldLevel);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        output.writeRawByte((byte) 96);
        output.writeUInt32NoTag(monsterId);
      }
      if ((bitField0_ & 0x00000008) != 0) {
        output.writeRawByte((byte) 24);
        output.writeBoolNoTag(mNGIHHFBPLO);
      }
      if ((bitField0_ & 0x00000010) != 0) {
        output.writeRawByte((byte) 88);
        output.writeBoolNoTag(aHNAIBGMCDB);
      }
    }

    @Override
    protected int computeSerializedSize() {
      int size = 0;
      if ((bitField0_ & 0x00000001) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(sceneEventId);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(worldLevel);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(monsterId);
      }
      if ((bitField0_ & 0x00000008) != 0) {
        size += 2;
      }
      if ((bitField0_ & 0x00000010) != 0) {
        size += 2;
      }
      return size;
    }

    @Override
    @SuppressWarnings("fallthrough")
    public SceneNpcMonsterInfo mergeFrom(final ProtoSource input) throws IOException {
      // Enabled Fall-Through Optimization (QuickBuffers)
      int tag = input.readTag();
      while (true) {
        switch (tag) {
          case 8: {
            // sceneEventId
            sceneEventId = input.readUInt32();
            bitField0_ |= 0x00000001;
            tag = input.readTag();
            if (tag != 80) {
              break;
            }
          }
          case 80: {
            // worldLevel
            worldLevel = input.readUInt32();
            bitField0_ |= 0x00000002;
            tag = input.readTag();
            if (tag != 96) {
              break;
            }
          }
          case 96: {
            // monsterId
            monsterId = input.readUInt32();
            bitField0_ |= 0x00000004;
            tag = input.readTag();
            if (tag != 24) {
              break;
            }
          }
          case 24: {
            // mNGIHHFBPLO
            mNGIHHFBPLO = input.readBool();
            bitField0_ |= 0x00000008;
            tag = input.readTag();
            if (tag != 88) {
              break;
            }
          }
          case 88: {
            // aHNAIBGMCDB
            aHNAIBGMCDB = input.readBool();
            bitField0_ |= 0x00000010;
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
        output.writeUInt32(FieldNames.sceneEventId, sceneEventId);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeUInt32(FieldNames.worldLevel, worldLevel);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        output.writeUInt32(FieldNames.monsterId, monsterId);
      }
      if ((bitField0_ & 0x00000008) != 0) {
        output.writeBool(FieldNames.mNGIHHFBPLO, mNGIHHFBPLO);
      }
      if ((bitField0_ & 0x00000010) != 0) {
        output.writeBool(FieldNames.aHNAIBGMCDB, aHNAIBGMCDB);
      }
      output.endObject();
    }

    @Override
    public SceneNpcMonsterInfo mergeFrom(final JsonSource input) throws IOException {
      if (!input.beginObject()) {
        return this;
      }
      while (!input.isAtEnd()) {
        switch (input.readFieldHash()) {
          case 748898089:
          case 765114163: {
            if (input.isAtField(FieldNames.sceneEventId)) {
              if (!input.trySkipNullValue()) {
                sceneEventId = input.readUInt32();
                bitField0_ |= 0x00000001;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case 440007442:
          case 1305257111: {
            if (input.isAtField(FieldNames.worldLevel)) {
              if (!input.trySkipNullValue()) {
                worldLevel = input.readUInt32();
                bitField0_ |= 0x00000002;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case -1316830571:
          case 2127946656: {
            if (input.isAtField(FieldNames.monsterId)) {
              if (!input.trySkipNullValue()) {
                monsterId = input.readUInt32();
                bitField0_ |= 0x00000004;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case 1425148660: {
            if (input.isAtField(FieldNames.mNGIHHFBPLO)) {
              if (!input.trySkipNullValue()) {
                mNGIHHFBPLO = input.readBool();
                bitField0_ |= 0x00000008;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case -1710050680: {
            if (input.isAtField(FieldNames.aHNAIBGMCDB)) {
              if (!input.trySkipNullValue()) {
                aHNAIBGMCDB = input.readBool();
                bitField0_ |= 0x00000010;
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
    public SceneNpcMonsterInfo clone() {
      return new SceneNpcMonsterInfo().copyFrom(this);
    }

    @Override
    public boolean isEmpty() {
      return ((bitField0_) == 0);
    }

    public static SceneNpcMonsterInfo parseFrom(final byte[] data) throws
        InvalidProtocolBufferException {
      return ProtoMessage.mergeFrom(new SceneNpcMonsterInfo(), data).checkInitialized();
    }

    public static SceneNpcMonsterInfo parseFrom(final ProtoSource input) throws IOException {
      return ProtoMessage.mergeFrom(new SceneNpcMonsterInfo(), input).checkInitialized();
    }

    public static SceneNpcMonsterInfo parseFrom(final JsonSource input) throws IOException {
      return ProtoMessage.mergeFrom(new SceneNpcMonsterInfo(), input).checkInitialized();
    }

    /**
     * @return factory for creating SceneNpcMonsterInfo messages
     */
    public static MessageFactory<SceneNpcMonsterInfo> getFactory() {
      return SceneNpcMonsterInfoFactory.INSTANCE;
    }

    private enum SceneNpcMonsterInfoFactory implements MessageFactory<SceneNpcMonsterInfo> {
      INSTANCE;

      @Override
      public SceneNpcMonsterInfo create() {
        return SceneNpcMonsterInfo.newInstance();
      }
    }

    /**
     * Contains name constants used for serializing JSON
     */
    static class FieldNames {
      static final FieldName sceneEventId = FieldName.forField("sceneEventId", "scene_event_id");

      static final FieldName worldLevel = FieldName.forField("worldLevel", "world_level");

      static final FieldName monsterId = FieldName.forField("monsterId", "monster_id");

      static final FieldName mNGIHHFBPLO = FieldName.forField("MNGIHHFBPLO");

      static final FieldName aHNAIBGMCDB = FieldName.forField("AHNAIBGMCDB");
    }
  }
}
