package com.sperasoft.mood.javaforqa.task2.objects;



public class Clock {

    private static final int HOUSR = 24;
    private static final int MINUTES = 60;
    private static final int SECONDS = 60;

    private int hours = 0;
    private int minutes = 0;
    private int seconds = 0;

    public Clock() {
        hours = 12;
        minutes = 0;
        seconds = 0;
    }

    public Clock(int hours, int minutes, int seconds) {
        if (hours < 0 || hours > 23) {
            this.hours = 0;
        } else {
            this.hours = hours;
        }

        if (minutes < 0 || minutes > 59) {
            this.minutes = 0;
        } else {
            this.minutes = minutes;
        }

        if (seconds < 0 || seconds > 59) {
            this.seconds = 0;
        } else {
            this.seconds = seconds;
        }
    }


    @Override
    public String toString() {
        return "Clock{}";
    }


    public Clock(int seconds) {
        setSinceMidnight(seconds);
    }

    private void setSinceMidnight(int seconds) {
       // if (seconds < 0 || seconds > 59) {
       //     this.seconds = 0;
      // } else {
       //     this.seconds = seconds;
       // }
        this.seconds = seconds;
        if (this.seconds > 59) {
            this.minutes = this.seconds / SECONDS;
            this.seconds = this.seconds % SECONDS;
            if (minutes > 59) {
                this.hours = minutes / MINUTES;
                this.minutes = minutes % MINUTES;
                if (hours > 23) {
                    hours = hours % HOUSR;
                }
            }
        }
    }

    public void print() {
        System.out.println("Time: " + hours + ":" + minutes + ":" + seconds + "\n");
    }

    public void tick(int amountTicks) {

        for (int i = 1; i < amountTicks + 1; i++) {
            seconds++;
            System.out.println("Tick: " + hours + ":" + minutes + ":" + seconds + "\n");
        }
    }

    public void tickDown(int amountTicks1) {


        for (int i = 1; i < amountTicks1+1; i++) {
            seconds--;
            System.out.println("Tick: " + hours + ":" + minutes + ":" + seconds + "\n");
        }
    }

    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    public int getSeconds() {
        return seconds;
    }

    public void setSeconds(int seconds) {
        this.seconds = seconds;
    }

    public int getHours() {
        return hours;
    }


    public void setHours(int hours) {
        this.hours = hours;

    }


    public Clock addClock(Clock clock) {
        return new Clock(Math.abs(clock.getSeconds() + clock.getHours() *MINUTES * SECONDS + clock.getMinutes() * SECONDS +
                this.seconds + this.hours * MINUTES * SECONDS + this.minutes * SECONDS));

    }
/**
if (seconds > 59) {
            minutes++;}


        if (minutes>59){
            hours ++;}

        if (hours > 24){
            hours = hours - 24;
        }
    }
    */
    public Clock substrackClock(Clock clock) {
        return new Clock(Math.abs(clock.getSeconds() + clock.getHours() *MINUTES * SECONDS + clock.getMinutes() *SECONDS -
                this.seconds - this.hours *MINUTES * SECONDS - this.minutes * SECONDS));
     //   Math.abs(clock.getSeconds() + clock.getHours() *60  *60 + clock.getMinutes() * 60 -
          //      this.seconds - this.hours * 60 * 60 - this.minutes * 60));
    }}







