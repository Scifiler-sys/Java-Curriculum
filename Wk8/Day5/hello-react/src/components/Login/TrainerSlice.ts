import { createSlice, PayloadAction } from "@reduxjs/toolkit";
import { ITrainer } from "../../models/TrainerModel";
import { RootState } from "../../shared/Redux/store";

//Setting up the initial state of this slice and what kind of object it will be
const initialState: ITrainer = {
        name: "",
        totalBadge: 0,
        id: 0,
        listOfPokemon: []
}

const trainerSlice = createSlice({
    name:"trainer",
    initialState,

    /*
        Since the store is immutable, we need to dictate to Redux how can we change our value

        Redux action is an object that will contain the information (which they call payload) we need to change our current state
        They call it "action" because every time you sent information from the view that is usually done by doing some sort of action within the view (like clicking a button)
    */
    reducers: {
        setTrainer: (state, action: PayloadAction<ITrainer>) => {
            //My pain staking long debugging took me deep into redux documentation and found out that you MUST have the state point to a completely different reference location
            // or else it will not detect any change and not bother saving your state
            // state = action.payload; WILL NOT WORK

            state.name = action.payload.name;
            state.id = action.payload.id;
            state.listOfPokemon = action.payload.listOfPokemon;
            state.totalBadge = action.payload.totalBadge;
        },
        //You can setup more types of reducers if you want that changes the way the reducer will mutate your data
        setDefault: (state) => {
            state.listOfPokemon = [];
            state.name = "";
            state.totalBadge = 0;
            state.id = 0;
        }
    }
})

//We want to export everything so every component will have access to our reducers
export const {setTrainer, setDefault} = trainerSlice.actions;

//Letting our store have access this slicer's reducer
export default trainerSlice.reducer;

//Letting all our component have access to the slicer's information
export const selectTrainer = (state:RootState) => state.trainer;