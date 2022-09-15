/**
 * Unfortunately, React redux doesn't fully support TS all the way
 * So, we have to create our very own hooks (kind of)
 * Basically, we are creating a typescript version of the hooks from their js so we can enforce strictly typing
 */

import { TypedUseSelectorHook, useDispatch, useSelector } from "react-redux";
import { AppDispatch, RootState } from "./store";

export const useAppDispatch: () => AppDispatch = useDispatch;
export const useAppSelector: TypedUseSelectorHook<RootState> = useSelector