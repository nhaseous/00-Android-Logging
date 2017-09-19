09-19 00:07:41.325 2382-2389/nha.networksapp1 W/zygote: Suspending all threads took: 14.918ms
09-19 00:07:41.358 2382-2382/nha.networksapp1 I/MainActivity: onPause() called
09-19 00:07:41.359 2382-2382/nha.networksapp1 I/MainActivity: onPause() terminated
09-19 00:07:41.371 2382-2382/nha.networksapp1 I/MainActivity: onStop() called
09-19 00:07:41.371 2382-2382/nha.networksapp1 I/MainActivity: onStop() terminated
09-19 00:07:41.371 2382-2382/nha.networksapp1 I/MainActivity: onDestroy() called
09-19 00:07:41.371 2382-2382/nha.networksapp1 I/MainActivity: onDestroy() terminated
09-19 00:07:41.499 2382-2382/nha.networksapp1 I/MainActivity: onCreate() called
                                                              
                                                              [ 09-19 00:07:41.542  1572: 1792 D/         ]
                                                              SurfaceInterface::setAsyncMode: set async mode 1
09-19 00:07:41.545 2382-2382/nha.networksapp1 I/MainActivity: onCreate() terminated
09-19 00:07:41.548 2382-2382/nha.networksapp1 I/MainActivity: onStart() called
09-19 00:07:41.548 2382-2382/nha.networksapp1 I/MainActivity: onStart() terminated
09-19 00:07:41.559 2382-2382/nha.networksapp1 I/MainActivity: onResume() called
09-19 00:07:41.561 2382-2382/nha.networksapp1 I/MainActivity: onResume() terminated
09-19 00:07:41.658 2382-2387/nha.networksapp1 I/zygote: Do full code cache collection, code=103KB, data=79KB
09-19 00:07:41.658 2382-2387/nha.networksapp1 I/zygote: After code cache collection, code=102KB, data=61KB

______________________________________________________________________________________________________________

When the screen is rotated, the app, from the activity running state, calls the onPause() function to pause the current instance of the app, then calls onStop() to stop the current instance. It then calls onDestroy() to destroy the current instance of the app, after which it calls onCreate() to create a new instance of the app in the new orientation. It then calls onStart() to set up the new instance, then calls onResume() after to get the instance of the app, now in the new orientation, back to the activity running state.