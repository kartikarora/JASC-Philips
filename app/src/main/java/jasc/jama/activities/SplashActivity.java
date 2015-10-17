package jasc.jama.activities;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.AppCompatButton;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.LinearLayout;

import com.github.jorgecastillo.FillableLoader;
import com.github.jorgecastillo.State;
import com.github.jorgecastillo.listener.OnStateChangeListener;

import jasc.jama.R;

public class SplashActivity extends AppCompatActivity {

    private String path = "M 232.00,35.41\n" +
            "           C 232.00,35.41 258.00,34.31 258.00,34.31\n" +
            "             258.00,34.31 265.00,34.31 265.00,34.31\n" +
            "             265.00,34.31 271.00,34.31 271.00,34.31\n" +
            "             271.00,34.31 289.00,36.00 289.00,36.00\n" +
            "             289.00,36.00 294.00,37.00 294.00,37.00\n" +
            "             294.00,37.00 299.00,38.00 299.00,38.00\n" +
            "             299.00,38.00 304.00,39.00 304.00,39.00\n" +
            "             304.00,39.00 304.00,40.00 304.00,40.00\n" +
            "             304.00,40.00 306.00,41.00 306.00,41.00\n" +
            "             306.46,40.63 306.26,40.23 307.54,39.99\n" +
            "             310.16,39.52 321.29,43.90 323.00,46.00\n" +
            "             323.00,46.00 326.00,45.00 326.00,45.00\n" +
            "             326.00,45.00 330.00,48.00 330.00,48.00\n" +
            "             333.04,46.00 338.25,50.19 343.00,51.00\n" +
            "             343.00,51.00 342.00,53.00 342.00,53.00\n" +
            "             342.00,53.00 345.00,52.00 345.00,52.00\n" +
            "             345.00,52.00 344.00,54.00 344.00,54.00\n" +
            "             344.00,54.00 348.00,55.00 348.00,55.00\n" +
            "             348.00,55.00 356.00,57.00 356.00,57.00\n" +
            "             356.00,57.00 358.00,58.00 358.00,58.00\n" +
            "             358.00,58.00 362.00,62.00 362.00,62.00\n" +
            "             362.00,62.00 369.00,64.00 369.00,64.00\n" +
            "             369.74,66.95 372.39,66.55 375.01,67.94\n" +
            "             378.72,69.91 379.99,71.43 382.00,75.00\n" +
            "             387.13,74.61 392.39,79.21 394.00,84.00\n" +
            "             397.65,84.23 397.85,84.56 399.00,88.00\n" +
            "             404.00,88.55 405.93,91.28 409.00,95.00\n" +
            "             409.00,95.00 400.00,94.00 400.00,94.00\n" +
            "             400.00,94.00 400.00,119.00 400.00,119.00\n" +
            "             400.00,121.65 399.62,127.59 401.02,129.69\n" +
            "             402.60,132.05 405.48,131.95 408.00,132.00\n" +
            "             415.76,132.14 428.06,130.66 430.18,141.04\n" +
            "             431.21,146.08 429.37,148.12 429.00,152.00\n" +
            "             415.60,160.64 412.14,157.52 398.00,154.00\n" +
            "             398.00,154.00 398.00,166.00 398.00,166.00\n" +
            "             398.00,166.00 410.00,168.56 410.00,168.56\n" +
            "             420.49,170.22 429.76,167.10 436.79,158.99\n" +
            "             451.96,141.49 432.87,116.76 412.00,121.00\n" +
            "             412.00,121.00 412.00,105.00 412.00,105.00\n" +
            "             418.01,105.07 423.58,105.77 424.00,113.00\n" +
            "             429.54,114.99 431.06,117.32 432.00,123.00\n" +
            "             436.82,123.98 436.59,126.49 439.38,130.00\n" +
            "             443.93,135.71 453.97,150.86 454.00,158.00\n" +
            "             456.74,159.75 456.64,159.79 457.00,163.00\n" +
            "             457.00,163.00 459.00,163.00 459.00,163.00\n" +
            "             459.24,167.27 461.86,171.00 463.36,174.96\n" +
            "             463.36,174.96 469.33,193.00 469.33,193.00\n" +
            "             470.66,197.06 473.32,202.09 471.00,206.00\n" +
            "             473.70,209.63 473.71,211.61 473.00,216.00\n" +
            "             475.70,218.49 476.55,228.07 477.20,232.00\n" +
            "             479.04,245.06 478.99,264.89 477.20,278.00\n" +
            "             476.69,282.51 476.21,293.03 473.00,296.00\n" +
            "             473.00,296.00 472.00,300.00 472.00,300.00\n" +
            "             472.00,300.00 471.00,306.00 471.00,306.00\n" +
            "             471.42,306.45 471.86,306.26 472.16,307.54\n" +
            "             472.82,310.28 469.28,319.28 467.00,321.00\n" +
            "             467.00,321.00 468.00,324.00 468.00,324.00\n" +
            "             468.00,324.00 464.00,330.00 464.00,330.00\n" +
            "             464.00,330.00 463.00,332.00 463.00,332.00\n" +
            "             465.14,336.80 461.34,337.86 461.00,343.00\n" +
            "             461.00,343.00 459.00,343.00 459.00,343.00\n" +
            "             459.00,343.00 460.00,345.00 460.00,345.00\n" +
            "             460.00,345.00 458.00,345.00 458.00,345.00\n" +
            "             458.00,345.00 457.00,348.00 457.00,348.00\n" +
            "             457.00,348.00 455.00,356.00 455.00,356.00\n" +
            "             455.00,356.00 454.00,358.00 454.00,358.00\n" +
            "             454.00,358.00 447.00,367.00 447.00,367.00\n" +
            "             447.00,367.00 448.00,369.00 448.00,369.00\n" +
            "             448.00,369.00 445.00,370.00 445.00,370.00\n" +
            "             444.96,374.93 442.23,377.58 440.00,382.00\n" +
            "             440.00,382.00 437.00,382.00 437.00,382.00\n" +
            "             437.00,382.00 436.00,388.00 436.00,388.00\n" +
            "             431.61,389.29 431.20,392.04 430.00,396.00\n" +
            "             430.00,396.00 427.00,395.00 427.00,395.00\n" +
            "             427.00,395.00 426.00,400.00 426.00,400.00\n" +
            "             422.17,400.79 422.22,403.63 419.36,406.88\n" +
            "             419.36,406.88 412.40,412.84 412.40,412.84\n" +
            "             412.40,412.84 407.85,418.52 407.85,418.52\n" +
            "             404.90,421.23 401.95,421.02 401.00,425.00\n" +
            "             401.00,425.00 398.81,425.81 398.81,425.81\n" +
            "             398.81,425.81 389.66,432.94 389.66,432.94\n" +
            "             389.66,432.94 389.00,435.00 389.00,435.00\n" +
            "             389.00,435.00 385.00,438.00 385.00,438.00\n" +
            "             385.00,438.00 383.00,436.00 383.00,436.00\n" +
            "             383.00,436.00 382.00,439.00 382.00,439.00\n" +
            "             382.00,439.00 380.00,441.00 380.00,441.00\n" +
            "             380.00,441.00 374.00,442.00 374.00,442.00\n" +
            "             374.00,442.00 373.00,445.00 373.00,445.00\n" +
            "             373.00,445.00 371.00,444.00 371.00,444.00\n" +
            "             371.00,444.00 371.00,446.00 371.00,446.00\n" +
            "             371.00,446.00 367.00,449.00 367.00,449.00\n" +
            "             367.00,449.00 365.00,448.00 365.00,448.00\n" +
            "             365.00,448.00 362.00,452.00 362.00,452.00\n" +
            "             362.00,452.00 360.00,450.00 360.00,450.00\n" +
            "             360.00,450.00 359.00,453.00 359.00,453.00\n" +
            "             359.00,453.00 357.00,452.00 357.00,452.00\n" +
            "             357.00,452.00 357.00,454.00 357.00,454.00\n" +
            "             350.94,455.07 351.54,459.58 343.00,458.00\n" +
            "             343.00,458.00 344.00,425.00 344.00,425.00\n" +
            "             344.00,425.00 344.00,363.00 344.00,363.00\n" +
            "             344.00,363.00 344.00,164.00 344.00,164.00\n" +
            "             344.00,164.00 373.00,164.00 373.00,164.00\n" +
            "             373.00,164.00 373.00,132.00 373.00,132.00\n" +
            "             373.00,132.00 273.00,132.00 273.00,132.00\n" +
            "             273.00,132.00 242.00,132.00 242.00,132.00\n" +
            "             242.00,132.00 223.00,133.00 223.00,133.00\n" +
            "             224.61,138.68 224.61,157.32 223.00,163.00\n" +
            "             223.00,163.00 254.00,164.00 254.00,164.00\n" +
            "             254.00,164.00 312.00,164.00 312.00,164.00\n" +
            "             312.00,164.00 312.00,191.00 312.00,191.00\n" +
            "             312.00,191.00 256.00,191.00 256.00,191.00\n" +
            "             256.00,191.00 223.00,192.00 223.00,192.00\n" +
            "             223.00,192.00 224.00,209.00 224.00,209.00\n" +
            "             224.00,209.00 224.00,238.00 224.00,238.00\n" +
            "             224.00,238.00 224.00,297.00 224.00,297.00\n" +
            "             224.00,297.00 223.00,329.00 223.00,329.00\n" +
            "             223.00,329.00 255.00,329.00 255.00,329.00\n" +
            "             255.00,329.00 255.00,223.00 255.00,223.00\n" +
            "             255.00,223.00 312.00,223.00 312.00,223.00\n" +
            "             312.00,223.00 312.00,307.00 312.00,307.00\n" +
            "             312.00,307.00 313.00,322.00 313.00,322.00\n" +
            "             313.00,322.00 313.00,383.00 313.00,383.00\n" +
            "             313.00,383.00 313.00,442.00 313.00,442.00\n" +
            "             313.00,442.00 313.00,471.00 313.00,471.00\n" +
            "             313.00,471.00 303.00,473.00 303.00,473.00\n" +
            "             303.00,473.00 304.00,471.00 304.00,471.00\n" +
            "             304.00,471.00 297.00,474.00 297.00,474.00\n" +
            "             297.00,474.00 292.00,475.00 292.00,475.00\n" +
            "             292.00,475.00 254.00,478.00 254.00,478.00\n" +
            "             254.00,478.00 221.00,475.00 221.00,475.00\n" +
            "             221.00,475.00 216.00,474.00 216.00,474.00\n" +
            "             216.00,474.00 211.00,473.00 211.00,473.00\n" +
            "             211.00,473.00 211.00,472.00 211.00,472.00\n" +
            "             211.00,472.00 209.00,471.00 209.00,471.00\n" +
            "             209.00,471.00 210.00,473.00 210.00,473.00\n" +
            "             205.80,472.15 196.62,470.46 194.00,467.00\n" +
            "             194.00,467.00 191.00,468.00 191.00,468.00\n" +
            "             191.00,468.00 188.00,467.00 188.00,467.00\n" +
            "             188.00,467.00 188.00,465.00 188.00,465.00\n" +
            "             188.00,465.00 185.00,466.00 185.00,466.00\n" +
            "             185.00,466.00 186.00,464.00 186.00,464.00\n" +
            "             186.00,464.00 184.00,464.00 184.00,464.00\n" +
            "             184.00,464.00 184.00,466.00 184.00,466.00\n" +
            "             184.00,466.00 183.00,466.00 183.00,466.00\n" +
            "             183.00,466.00 176.00,461.00 176.00,461.00\n" +
            "             176.00,461.00 174.00,462.00 174.00,462.00\n" +
            "             174.00,462.00 169.00,460.00 169.00,460.00\n" +
            "             169.00,460.00 170.00,458.00 170.00,458.00\n" +
            "             162.61,459.40 163.73,455.86 158.00,455.00\n" +
            "             158.00,455.00 156.00,454.00 156.00,454.00\n" +
            "             156.00,454.00 155.45,452.49 155.45,452.49\n" +
            "             155.45,452.49 144.00,448.00 144.00,448.00\n" +
            "             144.00,448.00 145.00,446.00 145.00,446.00\n" +
            "             145.00,446.00 144.00,445.00 144.00,445.00\n" +
            "             144.00,445.00 142.00,444.00 142.00,444.00\n" +
            "             135.50,444.10 128.44,437.40 123.00,434.00\n" +
            "             122.49,431.51 122.44,431.58 120.00,431.00\n" +
            "             120.00,431.00 120.00,429.00 120.00,429.00\n" +
            "             120.00,429.00 109.00,423.00 109.00,423.00\n" +
            "             109.00,423.00 110.00,420.00 110.00,420.00\n" +
            "             102.71,417.05 94.94,409.25 92.00,402.00\n" +
            "             92.00,402.00 89.00,403.00 89.00,403.00\n" +
            "             85.58,394.56 86.12,398.26 82.64,393.83\n" +
            "             80.53,391.16 81.79,389.91 78.00,389.00\n" +
            "             78.00,389.00 78.00,385.00 78.00,385.00\n" +
            "             78.00,385.00 76.00,382.00 76.00,382.00\n" +
            "             76.00,382.00 74.00,382.00 74.00,382.00\n" +
            "             74.00,382.00 75.00,380.00 75.00,380.00\n" +
            "             75.00,380.00 72.00,380.00 72.00,380.00\n" +
            "             72.00,380.00 70.00,374.00 70.00,374.00\n" +
            "             66.98,373.11 67.62,371.82 68.00,369.00\n" +
            "             68.00,369.00 66.00,370.00 66.00,370.00\n" +
            "             66.00,370.00 66.00,366.00 66.00,366.00\n" +
            "             61.41,364.93 60.59,361.27 61.00,357.00\n" +
            "             56.62,354.33 53.12,346.97 54.00,342.00\n" +
            "             54.00,342.00 53.00,340.00 53.00,340.00\n" +
            "             53.00,340.00 51.00,340.00 51.00,340.00\n" +
            "             51.00,340.00 52.00,338.00 52.00,338.00\n" +
            "             52.00,338.00 50.00,338.00 50.00,338.00\n" +
            "             50.00,338.00 51.00,336.00 51.00,336.00\n" +
            "             51.00,336.00 49.00,336.00 49.00,336.00\n" +
            "             48.40,331.63 45.88,330.34 48.00,326.00\n" +
            "             48.00,326.00 45.00,323.00 45.00,323.00\n" +
            "             45.00,323.00 44.00,320.00 44.00,320.00\n" +
            "             44.00,320.00 45.00,317.00 45.00,317.00\n" +
            "             41.56,314.86 39.94,305.01 39.00,301.00\n" +
            "             39.00,301.00 41.00,301.00 41.00,301.00\n" +
            "             41.00,301.00 41.00,299.00 41.00,299.00\n" +
            "             41.00,299.00 38.00,294.00 38.00,294.00\n" +
            "             38.00,294.00 37.00,289.00 37.00,289.00\n" +
            "             37.00,289.00 35.20,272.00 35.20,272.00\n" +
            "             35.20,272.00 35.20,258.00 35.20,258.00\n" +
            "             35.20,258.00 36.57,230.00 36.57,230.00\n" +
            "             36.57,230.00 39.00,212.00 39.00,212.00\n" +
            "             39.00,212.00 40.00,212.00 40.00,212.00\n" +
            "             40.00,212.00 41.00,210.00 41.00,210.00\n" +
            "             41.00,210.00 39.00,211.00 39.00,211.00\n" +
            "             39.00,211.00 45.00,189.00 45.00,189.00\n" +
            "             45.00,189.00 48.00,186.00 48.00,186.00\n" +
            "             48.00,186.00 49.00,176.00 49.00,176.00\n" +
            "             49.00,176.00 51.00,176.00 51.00,176.00\n" +
            "             51.00,176.00 57.00,158.00 57.00,158.00\n" +
            "             57.00,158.00 58.00,156.00 58.00,156.00\n" +
            "             58.00,156.00 63.00,151.00 63.00,151.00\n" +
            "             63.00,151.00 64.00,144.00 64.00,144.00\n" +
            "             64.00,144.00 66.33,142.83 66.33,142.83\n" +
            "             66.33,142.83 71.00,133.00 71.00,133.00\n" +
            "             71.00,133.00 74.00,133.00 74.00,133.00\n" +
            "             74.00,133.00 73.00,130.00 73.00,130.00\n" +
            "             73.00,130.00 75.00,131.00 75.00,131.00\n" +
            "             75.00,131.00 76.00,130.00 76.00,130.00\n" +
            "             76.00,130.00 75.00,128.00 75.00,128.00\n" +
            "             75.00,128.00 77.00,128.00 77.00,128.00\n" +
            "             77.00,128.00 77.00,124.00 77.00,124.00\n" +
            "             79.49,123.49 79.42,123.44 80.00,121.00\n" +
            "             80.00,121.00 82.00,117.00 82.00,117.00\n" +
            "             84.81,115.77 85.14,115.98 86.00,113.00\n" +
            "             86.00,113.00 87.00,112.00 87.00,112.00\n" +
            "             87.00,112.00 93.18,105.63 93.18,105.63\n" +
            "             93.18,105.63 100.92,99.08 100.92,99.08\n" +
            "             100.92,99.08 106.34,92.45 106.34,92.45\n" +
            "             106.34,92.45 113.00,86.00 113.00,86.00\n" +
            "             113.00,86.00 118.00,85.00 118.00,85.00\n" +
            "             118.00,85.00 117.00,82.00 117.00,82.00\n" +
            "             119.82,81.52 121.02,81.83 122.00,79.00\n" +
            "             122.00,79.00 124.00,80.00 124.00,80.00\n" +
            "             124.00,80.00 125.00,79.00 125.00,79.00\n" +
            "             125.88,75.11 127.20,74.86 131.00,75.00\n" +
            "             131.00,75.00 131.00,72.00 131.00,72.00\n" +
            "             131.00,72.00 144.00,65.18 144.00,65.18\n" +
            "             146.06,63.86 146.99,62.41 150.02,60.85\n" +
            "             153.31,59.16 156.08,60.15 157.00,57.00\n" +
            "             157.00,57.00 164.00,54.00 164.00,54.00\n" +
            "             164.00,54.00 164.00,56.00 164.00,56.00\n" +
            "             164.00,56.00 162.00,55.00 162.00,55.00\n" +
            "             162.00,55.00 162.00,66.00 162.00,66.00\n" +
            "             162.00,66.00 162.00,99.00 162.00,99.00\n" +
            "             162.00,99.00 162.00,191.00 162.00,191.00\n" +
            "             162.00,191.00 114.00,191.00 114.00,191.00\n" +
            "             106.78,191.01 104.15,190.85 104.00,199.00\n" +
            "             104.00,199.00 104.00,218.00 104.00,218.00\n" +
            "             104.00,218.00 127.00,218.00 127.00,218.00\n" +
            "             127.00,218.00 139.00,218.91 139.00,218.91\n" +
            "             139.00,218.91 164.00,218.00 164.00,218.00\n" +
            "             162.13,225.69 163.00,252.38 163.00,262.00\n" +
            "             163.00,262.00 163.00,309.00 163.00,309.00\n" +
            "             163.00,323.04 162.61,336.57 167.75,350.00\n" +
            "             172.78,363.16 180.67,370.51 193.96,374.99\n" +
            "             196.73,375.92 203.97,378.06 206.40,376.09\n" +
            "             208.87,374.08 208.06,360.54 208.00,357.00\n" +
            "             207.82,347.58 203.37,348.47 198.98,341.83\n" +
            "             196.01,337.35 194.96,330.31 194.95,325.00\n" +
            "             194.95,325.00 194.95,306.00 194.95,306.00\n" +
            "             194.95,306.00 194.95,256.00 194.95,256.00\n" +
            "             194.95,256.00 194.95,107.00 194.95,107.00\n" +
            "             194.95,107.00 194.95,50.00 194.95,50.00\n" +
            "             195.06,41.07 198.53,40.97 208.00,39.00\n" +
            "             208.00,39.00 207.00,41.00 207.00,41.00\n" +
            "             207.00,41.00 214.00,38.00 214.00,38.00\n" +
            "             214.00,38.00 219.00,37.00 219.00,37.00\n" +
            "             219.00,37.00 232.00,35.41 232.00,35.41 Z\n" +
            "           M 204.00,41.00\n" +
            "           C 204.00,41.00 205.00,42.00 205.00,42.00\n" +
            "             205.00,42.00 205.00,41.00 205.00,41.00\n" +
            "             205.00,41.00 204.00,41.00 204.00,41.00 Z\n" +
            "           M 153.00,60.00\n" +
            "           C 153.00,60.00 154.00,61.00 154.00,61.00\n" +
            "             154.00,61.00 154.00,60.00 154.00,60.00\n" +
            "             154.00,60.00 153.00,60.00 153.00,60.00 Z\n" +
            "           M 151.00,61.00\n" +
            "           C 151.00,61.00 152.00,62.00 152.00,62.00\n" +
            "             152.00,62.00 152.00,61.00 152.00,61.00\n" +
            "             152.00,61.00 151.00,61.00 151.00,61.00 Z\n" +
            "           M 141.00,67.00\n" +
            "           C 141.00,67.00 142.00,68.00 142.00,68.00\n" +
            "             142.00,68.00 142.00,67.00 142.00,67.00\n" +
            "             142.00,67.00 141.00,67.00 141.00,67.00 Z\n" +
            "           M 371.00,67.00\n" +
            "           C 371.00,67.00 372.00,68.00 372.00,68.00\n" +
            "             372.00,68.00 372.00,67.00 372.00,67.00\n" +
            "             372.00,67.00 371.00,67.00 371.00,67.00 Z\n" +
            "           M 373.00,68.00\n" +
            "           C 373.00,68.00 374.00,69.00 374.00,69.00\n" +
            "             374.00,69.00 374.00,68.00 374.00,68.00\n" +
            "             374.00,68.00 373.00,68.00 373.00,68.00 Z\n" +
            "           M 138.00,69.00\n" +
            "           C 138.00,69.00 139.00,70.00 139.00,70.00\n" +
            "             139.00,70.00 139.00,69.00 139.00,69.00\n" +
            "             139.00,69.00 138.00,69.00 138.00,69.00 Z\n" +
            "           M 134.00,71.00\n" +
            "           C 134.00,71.00 135.00,72.00 135.00,72.00\n" +
            "             135.00,72.00 135.00,71.00 135.00,71.00\n" +
            "             135.00,71.00 134.00,71.00 134.00,71.00 Z\n" +
            "           M 133.00,72.00\n" +
            "           C 133.00,72.00 134.00,73.00 134.00,73.00\n" +
            "             134.00,73.00 134.00,72.00 134.00,72.00\n" +
            "             134.00,72.00 133.00,72.00 133.00,72.00 Z\n" +
            "           M 129.00,75.00\n" +
            "           C 129.00,75.00 130.00,76.00 130.00,76.00\n" +
            "             130.00,76.00 130.00,75.00 130.00,75.00\n" +
            "             130.00,75.00 129.00,75.00 129.00,75.00 Z\n" +
            "           M 125.00,77.00\n" +
            "           C 125.00,77.00 126.00,78.00 126.00,78.00\n" +
            "             126.00,78.00 126.00,77.00 126.00,77.00\n" +
            "             126.00,77.00 125.00,77.00 125.00,77.00 Z\n" +
            "           M 400.00,88.00\n" +
            "           C 400.00,88.00 401.00,89.00 401.00,89.00\n" +
            "             401.00,89.00 401.00,88.00 401.00,88.00\n" +
            "             401.00,88.00 400.00,88.00 400.00,88.00 Z\n" +
            "           M 110.00,90.00\n" +
            "           C 110.00,90.00 111.00,91.00 111.00,91.00\n" +
            "             111.00,91.00 111.00,90.00 111.00,90.00\n" +
            "             111.00,90.00 110.00,90.00 110.00,90.00 Z\n" +
            "           M 106.00,93.00\n" +
            "           C 106.00,93.00 107.00,94.00 107.00,94.00\n" +
            "             107.00,94.00 107.00,93.00 107.00,93.00\n" +
            "             107.00,93.00 106.00,93.00 106.00,93.00 Z\n" +
            "           M 105.00,94.00\n" +
            "           C 105.00,94.00 106.00,95.00 106.00,95.00\n" +
            "             106.00,95.00 106.00,94.00 106.00,94.00\n" +
            "             106.00,94.00 105.00,94.00 105.00,94.00 Z\n" +
            "           M 94.00,105.00\n" +
            "           C 94.00,105.00 95.00,106.00 95.00,106.00\n" +
            "             95.00,106.00 95.00,105.00 95.00,105.00\n" +
            "             95.00,105.00 94.00,105.00 94.00,105.00 Z\n" +
            "           M 377.71,114.80\n" +
            "           C 372.57,120.85 376.62,125.61 384.00,124.00\n" +
            "             384.00,124.00 384.00,167.00 384.00,167.00\n" +
            "             384.00,167.00 394.00,167.00 394.00,167.00\n" +
            "             394.00,167.00 394.00,108.00 394.00,108.00\n" +
            "             385.36,108.00 383.66,107.80 377.71,114.80 Z\n" +
            "           M 87.00,113.00\n" +
            "           C 87.00,113.00 88.00,114.00 88.00,114.00\n" +
            "             88.00,114.00 88.00,113.00 88.00,113.00\n" +
            "             88.00,113.00 87.00,113.00 87.00,113.00 Z\n" +
            "           M 68.00,140.00\n" +
            "           C 68.00,140.00 69.00,141.00 69.00,141.00\n" +
            "             69.00,141.00 69.00,140.00 69.00,140.00\n" +
            "             69.00,140.00 68.00,140.00 68.00,140.00 Z\n" +
            "           M 64.00,146.00\n" +
            "           C 64.00,146.00 65.00,147.00 65.00,147.00\n" +
            "             65.00,147.00 65.00,146.00 65.00,146.00\n" +
            "             65.00,146.00 64.00,146.00 64.00,146.00 Z\n" +
            "           M 61.00,152.00\n" +
            "           C 61.00,152.00 62.00,153.00 62.00,153.00\n" +
            "             62.00,153.00 62.00,152.00 62.00,152.00\n" +
            "             62.00,152.00 61.00,152.00 61.00,152.00 Z\n" +
            "           M 41.00,304.00\n" +
            "           C 41.00,304.00 42.00,305.00 42.00,305.00\n" +
            "             42.00,305.00 42.00,304.00 42.00,304.00\n" +
            "             42.00,304.00 41.00,304.00 41.00,304.00 Z\n" +
            "           M 54.00,344.00\n" +
            "           C 54.00,344.00 55.00,345.00 55.00,345.00\n" +
            "             55.00,345.00 55.00,344.00 55.00,344.00\n" +
            "             55.00,344.00 54.00,344.00 54.00,344.00 Z\n" +
            "           M 232.23,357.43\n" +
            "           C 228.99,360.30 228.73,364.99 228.00,369.00\n" +
            "             228.00,369.00 234.00,376.00 234.00,376.00\n" +
            "             234.00,376.00 237.00,375.00 237.00,375.00\n" +
            "             239.33,377.50 240.83,376.18 244.00,376.00\n" +
            "             244.00,376.00 250.00,370.00 250.00,370.00\n" +
            "             250.21,366.83 251.51,365.36 249.00,363.00\n" +
            "             247.53,355.31 237.84,352.44 232.23,357.43 Z\n" +
            "           M 61.00,359.00\n" +
            "           C 61.00,359.00 62.00,360.00 62.00,360.00\n" +
            "             62.00,360.00 62.00,359.00 62.00,359.00\n" +
            "             62.00,359.00 61.00,359.00 61.00,359.00 Z\n" +
            "           M 62.00,360.00\n" +
            "           C 62.00,360.00 63.00,361.00 63.00,361.00\n" +
            "             63.00,361.00 63.00,360.00 63.00,360.00\n" +
            "             63.00,360.00 62.00,360.00 62.00,360.00 Z\n" +
            "           M 450.00,361.00\n" +
            "           C 450.00,361.00 451.00,362.00 451.00,362.00\n" +
            "             451.00,362.00 451.00,361.00 451.00,361.00\n" +
            "             451.00,361.00 450.00,361.00 450.00,361.00 Z\n" +
            "           M 64.00,365.00\n" +
            "           C 64.00,365.00 65.00,366.00 65.00,366.00\n" +
            "             65.00,366.00 65.00,365.00 65.00,365.00\n" +
            "             65.00,365.00 64.00,365.00 64.00,365.00 Z\n" +
            "           M 68.00,371.00\n" +
            "           C 68.00,371.00 69.00,372.00 69.00,372.00\n" +
            "             69.00,372.00 69.00,371.00 69.00,371.00\n" +
            "             69.00,371.00 68.00,371.00 68.00,371.00 Z\n" +
            "           M 444.00,371.00\n" +
            "           C 444.00,371.00 445.00,372.00 445.00,372.00\n" +
            "             445.00,372.00 445.00,371.00 445.00,371.00\n" +
            "             445.00,371.00 444.00,371.00 444.00,371.00 Z\n" +
            "           M 443.00,373.00\n" +
            "           C 443.00,373.00 444.00,374.00 444.00,374.00\n" +
            "             444.00,374.00 444.00,373.00 444.00,373.00\n" +
            "             444.00,373.00 443.00,373.00 443.00,373.00 Z\n" +
            "           M 442.00,374.00\n" +
            "           C 442.00,374.00 443.00,375.00 443.00,375.00\n" +
            "             443.00,375.00 443.00,374.00 443.00,374.00\n" +
            "             443.00,374.00 442.00,374.00 442.00,374.00 Z\n" +
            "           M 440.00,378.00\n" +
            "           C 440.00,378.00 441.00,379.00 441.00,379.00\n" +
            "             441.00,379.00 441.00,378.00 441.00,378.00\n" +
            "             441.00,378.00 440.00,378.00 440.00,378.00 Z\n" +
            "           M 439.00,379.00\n" +
            "           C 439.00,379.00 440.00,380.00 440.00,380.00\n" +
            "             440.00,380.00 440.00,379.00 440.00,379.00\n" +
            "             440.00,379.00 439.00,379.00 439.00,379.00 Z\n" +
            "           M 76.00,383.00\n" +
            "           C 76.00,383.00 77.00,384.00 77.00,384.00\n" +
            "             77.00,384.00 77.00,383.00 77.00,383.00\n" +
            "             77.00,383.00 76.00,383.00 76.00,383.00 Z\n" +
            "           M 421.00,402.00\n" +
            "           C 421.00,402.00 422.00,403.00 422.00,403.00\n" +
            "             422.00,403.00 422.00,402.00 422.00,402.00\n" +
            "             422.00,402.00 421.00,402.00 421.00,402.00 Z\n" +
            "           M 420.00,403.00\n" +
            "           C 420.00,403.00 421.00,404.00 421.00,404.00\n" +
            "             421.00,404.00 421.00,403.00 421.00,403.00\n" +
            "             421.00,403.00 420.00,403.00 420.00,403.00 Z\n" +
            "           M 403.00,420.00\n" +
            "           C 403.00,420.00 404.00,421.00 404.00,421.00\n" +
            "             404.00,421.00 404.00,420.00 404.00,420.00\n" +
            "             404.00,420.00 403.00,420.00 403.00,420.00 Z\n" +
            "           M 391.00,430.00\n" +
            "           C 391.00,430.00 392.00,431.00 392.00,431.00\n" +
            "             392.00,431.00 392.00,430.00 392.00,430.00\n" +
            "             392.00,430.00 391.00,430.00 391.00,430.00 Z\n" +
            "           M 129.00,436.00\n" +
            "           C 129.00,436.00 130.00,437.00 130.00,437.00\n" +
            "             130.00,437.00 130.00,436.00 130.00,436.00\n" +
            "             130.00,436.00 129.00,436.00 129.00,436.00 Z\n" +
            "           M 131.00,437.00\n" +
            "           C 131.00,437.00 132.00,438.00 132.00,438.00\n" +
            "             132.00,438.00 132.00,437.00 132.00,437.00\n" +
            "             132.00,437.00 131.00,437.00 131.00,437.00 Z\n" +
            "           M 132.00,438.00\n" +
            "           C 132.00,438.00 133.00,439.00 133.00,439.00\n" +
            "             133.00,439.00 133.00,438.00 133.00,438.00\n" +
            "             133.00,438.00 132.00,438.00 132.00,438.00 Z\n" +
            "           M 133.00,439.00\n" +
            "           C 133.00,439.00 134.00,440.00 134.00,440.00\n" +
            "             134.00,440.00 134.00,439.00 134.00,439.00\n" +
            "             134.00,439.00 133.00,439.00 133.00,439.00 Z\n" +
            "           M 140.00,443.00\n" +
            "           C 140.00,443.00 141.00,444.00 141.00,444.00\n" +
            "             141.00,444.00 141.00,443.00 141.00,443.00\n" +
            "             141.00,443.00 140.00,443.00 140.00,443.00 Z\n" +
            "           M 372.00,443.00\n" +
            "           C 372.00,443.00 373.00,444.00 373.00,444.00\n" +
            "             373.00,444.00 373.00,443.00 373.00,443.00\n" +
            "             373.00,443.00 372.00,443.00 372.00,443.00 Z\n" +
            "           M 146.00,447.00\n" +
            "           C 146.00,447.00 147.00,448.00 147.00,448.00\n" +
            "             147.00,448.00 147.00,447.00 147.00,447.00\n" +
            "             147.00,447.00 146.00,447.00 146.00,447.00 Z\n" +
            "           M 152.00,450.00\n" +
            "           C 152.00,450.00 153.00,451.00 153.00,451.00\n" +
            "             153.00,451.00 153.00,450.00 153.00,450.00\n" +
            "             153.00,450.00 152.00,450.00 152.00,450.00 Z\n" +
            "           M 358.00,451.00\n" +
            "           C 358.00,451.00 359.00,452.00 359.00,452.00\n" +
            "             359.00,452.00 359.00,451.00 359.00,451.00\n" +
            "             359.00,451.00 358.00,451.00 358.00,451.00 Z\n" +
            "           M 166.00,457.00\n" +
            "           C 166.00,457.00 167.00,458.00 167.00,458.00\n" +
            "             167.00,458.00 167.00,457.00 167.00,457.00\n" +
            "             167.00,457.00 166.00,457.00 166.00,457.00 Z\n" +
            "           M 346.00,457.00\n" +
            "           C 346.00,457.00 347.00,458.00 347.00,458.00\n" +
            "             347.00,458.00 347.00,457.00 347.00,457.00\n" +
            "             347.00,457.00 346.00,457.00 346.00,457.00 Z\n" +
            "           M 206.00,470.00\n" +
            "           C 206.00,470.00 207.00,471.00 207.00,471.00\n" +
            "             207.00,471.00 207.00,470.00 207.00,470.00\n" +
            "             207.00,470.00 206.00,470.00 206.00,470.00 Z\n" +
            "           M 306.00,470.00\n" +
            "           C 306.00,470.00 307.00,471.00 307.00,471.00\n" +
            "             307.00,471.00 307.00,470.00 307.00,470.00\n" +
            "             307.00,470.00 306.00,470.00 306.00,470.00 Z";

    public static Intent createIntent(Context context) {
        Intent intent = new Intent(context, SplashActivity.class);
        return intent;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        final Animation animationFadeIn = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.anim_fade_in);
        final Animation animationMoveUp = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.anim_move_up);

        final FillableLoader splashFillableLoader = (FillableLoader) findViewById(R.id.splash_fillable_loader);
        final LinearLayout layout = (LinearLayout) findViewById(R.id.button_layout);
        final AppCompatButton signinButton = (AppCompatButton) findViewById(R.id.splash_to_signin_button);
        final AppCompatButton signupButton = (AppCompatButton) findViewById(R.id.splash_to_signup_button);

        splashFillableLoader.setAnimation(animationMoveUp);


        splashFillableLoader.setSvgPath(path);
        splashFillableLoader.start();

        layout.setAnimation(animationFadeIn);
        animationFadeIn.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {

            }

            @Override
            public void onAnimationEnd(Animation animation) {
                signinButton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        startActivity(SignInActivity.createIntent(getApplicationContext()));
                    }
                });
                signupButton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        startActivity(SignUpActivity.createIntent(getApplicationContext()));
                    }
                });
            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        });


        splashFillableLoader.setOnStateChangeListener(new OnStateChangeListener() {
            @Override
            public void onStateChange(int i) {
                if (i == State.FINISHED) {
                    new Handler().postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            layout.setVisibility(View.VISIBLE);
                            animationFadeIn.start();
                            animationMoveUp.start();
                        }
                    }, 1000);

                }
            }
        });
    }


}
