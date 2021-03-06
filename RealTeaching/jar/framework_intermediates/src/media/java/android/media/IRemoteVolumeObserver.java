/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: frameworks/base/media/java/android/media/IRemoteVolumeObserver.aidl
 */
package android.media;
/**
 * AIDL for the AudioService to report requests for remote volume update requests.
 * @hide
 */
public interface IRemoteVolumeObserver extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements android.media.IRemoteVolumeObserver
{
private static final java.lang.String DESCRIPTOR = "android.media.IRemoteVolumeObserver";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an android.media.IRemoteVolumeObserver interface,
 * generating a proxy if needed.
 */
public static android.media.IRemoteVolumeObserver asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = (android.os.IInterface)obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof android.media.IRemoteVolumeObserver))) {
return ((android.media.IRemoteVolumeObserver)iin);
}
return new android.media.IRemoteVolumeObserver.Stub.Proxy(obj);
}
public android.os.IBinder asBinder()
{
return this;
}
@Override public boolean onTransact(int code, android.os.Parcel data, android.os.Parcel reply, int flags) throws android.os.RemoteException
{
switch (code)
{
case INTERFACE_TRANSACTION:
{
reply.writeString(DESCRIPTOR);
return true;
}
case TRANSACTION_dispatchRemoteVolumeUpdate:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
int _arg1;
_arg1 = data.readInt();
this.dispatchRemoteVolumeUpdate(_arg0, _arg1);
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements android.media.IRemoteVolumeObserver
{
private android.os.IBinder mRemote;
Proxy(android.os.IBinder remote)
{
mRemote = remote;
}
public android.os.IBinder asBinder()
{
return mRemote;
}
public java.lang.String getInterfaceDescriptor()
{
return DESCRIPTOR;
}
public void dispatchRemoteVolumeUpdate(int direction, int value) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(direction);
_data.writeInt(value);
mRemote.transact(Stub.TRANSACTION_dispatchRemoteVolumeUpdate, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
}
static final int TRANSACTION_dispatchRemoteVolumeUpdate = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
}
public void dispatchRemoteVolumeUpdate(int direction, int value) throws android.os.RemoteException;
}
