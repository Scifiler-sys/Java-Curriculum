import { configureStore } from "@reduxjs/toolkit";
import TrainerSlice from "../../components/Login/TrainerSlice";


export const store = configureStore({
    reducer: {
        trainer: TrainerSlice
    }
})

/**
 * Unfortunately, React redux doesn't fully support TS all the way
 * So, we have some extra configuration to enforce TS behavior
 * Basically, we are setting strict typing from their js version of methods
 */
export type AppDispatch = typeof store.dispatch
export type RootState = ReturnType<typeof store.getState>