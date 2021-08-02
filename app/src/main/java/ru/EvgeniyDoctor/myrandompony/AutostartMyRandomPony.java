package ru.EvgeniyDoctor.myrandompony;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.util.Log;



// todo 02.08.2021: Сервис стартовал, хотя он был выключен



public class AutostartMyRandomPony extends BroadcastReceiver {
    public AutostartMyRandomPony() {
    }

    @Override
    public void onReceive(Context context, Intent intent) {
        // запуск сервиса при загрузке
        Log.d(Helper.tag, "Autostart - onReceive");

        if (intent.getAction().equals(Intent.ACTION_BOOT_COMPLETED)){
            Log.d(Helper.tag, "Autostart - ACTION_BOOT_COMPLETED");

            Helper.startService(
                context,
                new Intent(context, Service_Refresh.class).addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
            );
        }
    }
    //--------------------------------------------------------------------------------------------------
}
